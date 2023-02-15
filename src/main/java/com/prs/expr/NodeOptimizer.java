package com.prs.expr;

import com.ecarx.ai.grammar.datatype.IntegerRange;

import java.util.*;

public class NodeOptimizer {
    public Node optimize(Node node) {
        if (node != null) {
            if (node instanceof ChoiceNode) {
                return optimizeChoice((ChoiceNode)node);
            } else if (node instanceof SequenceNode) {
                return optimizeSequence((SequenceNode)node);
            } else if (node instanceof RepeatNode) {
                return optimizeRepeatNode((RepeatNode)node);
            }
        }

        return node;
    }

    private Node optimizeSequence(SequenceNode node) {
        optimizeChildNodes(node.getNodes());

        Node[] childNodes = node.getNodes();

        if(childNodes.length == 1) {
            return childNodes[0];
        }

        if(Arrays.stream(childNodes).anyMatch(n -> n instanceof SequenceNode)) {
            List<Node> nodeList = new LinkedList<>();

            for(Node n : childNodes) {
                if(n instanceof SequenceNode) {
                    nodeList.addAll(Arrays.asList(((SequenceNode) n).getNodes()));
                } else {
                    nodeList.add(n);
                }
            }
            node.setNodes(nodeList.toArray(new Node[0]));
        }

        return node;
    }

    private Node optimizeChoice(ChoiceNode node) {
        Node[] childNodes = node.getNodes();

        optimizeChildNodes(childNodes);
        if(childNodes.length == 1)
            return childNodes[0];

        if(Arrays.stream(childNodes).anyMatch(n -> n instanceof ChoiceNode)) {
            List<Node> nodeList = new LinkedList<>();

            for(Node n : childNodes) {
                if(n instanceof ChoiceNode) {
                    nodeList.addAll(Arrays.asList(((ChoiceNode) n).getNodes()));
                } else {
                    nodeList.add(n);
                }
            }

            childNodes = nodeList.toArray(new Node[0]);
            node.setNodes(childNodes);
        }

        Arrays.sort(childNodes);

        //TODO: try to merge choices here
        int mergedCount = 0;
        for(int i = 0; i < childNodes.length - 1; i++) {
            if(childNodes[i] == null)
                continue;

            for(int j = i + 1; j < childNodes.length; j++) {
                if(childNodes[j] == null)
                    continue;

                Node mergedNode = mergeBranches(childNodes[i], childNodes[j]);

                if(mergedNode != null) {
                    //successfully merged
                    childNodes[i] = mergedNode;
                    childNodes[j] = null;

                    mergedCount++;
                }
            }
        }

        if(mergedCount > 0) {
            Node[] resultNodes = Arrays.stream(childNodes).filter(Objects::nonNull).toArray(Node[]::new);

            if(resultNodes.length == 1) {
                return resultNodes[0];
            } else {
                node.setNodes(resultNodes);
                return node;
            }
        }

        return node;
    }

    private Node mergeBranches(Node node1, Node node2) {
        if(node1 instanceof SequenceNode) {
            if(node2 instanceof SequenceNode) {
                Node[] nodes1 = ((SequenceNode) node1).getNodes();
                Node[] nodes2 = ((SequenceNode) node2).getNodes();

                int left = 0;
                int right = 0;
                for(; left < nodes1.length && left < nodes2.length; left++) {
                    if(nodes1[left].compareTo(nodes2[left]) != 0) {
                        break;
                    }
                }

                for(; right < nodes1.length - left && right < nodes2.length - left; right++) {
                    if(nodes1[nodes1.length - right - 1].compareTo(nodes2[nodes2.length - right - 1]) != 0) {
                        break;
                    }
                }

                if(left + right > 0) {
                    List<Node> resultNodes = new ArrayList<>();
                    for (int i = 0; i < left; i++) {
                        resultNodes.add(nodes1[i]);
                    }

                    int remain1 = nodes1.length - left - right;
                    int remain2 = nodes2.length - left - right;

                    Node sub1 = getSubsequence(nodes1, left, remain1);
                    Node sub2 = getSubsequence(nodes2, left, remain2);

                    if(sub1 == null && sub2 == null) {

                    } else if(sub1 == null || sub2 == null) {
                        RepeatNode repeatNode = new RepeatNode();
                        repeatNode.setRange(IntegerRange.lowerAndUpper(0, 1));
                        repeatNode.setNode(sub1 == null ? sub2 : sub1);
                        resultNodes.add(optimizeRepeatNode(repeatNode));
                    } else {
                        ChoiceNode choiceNode = new ChoiceNode();

                        choiceNode.setNodes(new Node[] {sub1, sub2});
                        resultNodes.add(optimizeChoice(choiceNode));
                    }

                    for (int i = 0; i < right; i++) {
                        resultNodes.add(nodes1[left + remain1 + i]);
                    }

                    SequenceNode sequenceNode = new SequenceNode();
                    sequenceNode.setNodes(resultNodes.toArray(new Node[0]));
                    return sequenceNode;
                }
            } else {

            }
        } else {
            if(node2 instanceof SequenceNode) {

            } else {

            }
        }

        return null;
    }

    private Node getSubsequence(Node[] nodes, int offset, int length) {
        if(length <= 0 || offset < 0 || offset + length > nodes.length)
            return null;

        if(length == 1)
            return nodes[offset];

        SequenceNode sequenceNode = new SequenceNode();
        sequenceNode.setNodes(Arrays.copyOfRange(nodes, offset, offset + length));
        return sequenceNode;
    }

    private Node optimizeRepeatNode(RepeatNode node) {
        Node childNode = optimize(node.getNode());

        if(childNode instanceof RepeatNode) {
            IntegerRange mergedRange = mergeIntegerRange(node.getRange(), ((RepeatNode) childNode).getRange());

            if(mergedRange != null) {
                RepeatNode mergedNode = new RepeatNode();
                mergedNode.setNode(((RepeatNode) childNode).getNode());
                mergedNode.setRange(mergedRange);
                mergedNode.setSnippet(node.getSnippet());
                return mergedNode;
            }
        }
        node.setNode(childNode);

        return node;
    }

    private IntegerRange mergeIntegerRange(IntegerRange range1, IntegerRange range2) {
        if(range1.getLowerBound() == 0 && range1.getUpperBound() == 1) {
            if(range2.getLowerBound() <= 1) {
                return IntegerRange.lowerAndUpper(0, range2.getUpperBound());
            }
        } else if(range1.getLowerBound() == 0 && range1.getUpperBound() == Integer.MAX_VALUE) {
            if(range2.getLowerBound() <= 1) {
                return range1;
            }
        } else if(range1.getLowerBound() == 1 && range1.getUpperBound() == Integer.MAX_VALUE) {
            if(range2.getLowerBound() <= 1) {
                return IntegerRange.lowerAndUpper(range2.getLowerBound(), range1.getUpperBound());
            }
        } else if(range2.getLowerBound() == 0 && range2.getUpperBound() == 1) {
            if(range1.getLowerBound() <= 1) {
                return IntegerRange.lowerAndUpper(0, range1.getUpperBound());
            }
        } else if(range2.getLowerBound() == 0 && range2.getUpperBound() == Integer.MAX_VALUE) {
            if(range1.getLowerBound() <= 1) {
                return range2;
            }
        } else if(range2.getLowerBound() == 1 && range2.getUpperBound() == Integer.MAX_VALUE) {
            if(range1.getLowerBound() <= 1) {
                return IntegerRange.lowerAndUpper(range1.getLowerBound(), range2.getUpperBound());
            }
        }

        return null;
    }

    private void optimizeChildNodes(Node[] nodes) {
        for(int i = 0; i < nodes.length; i++) {
            nodes[i] = optimize(nodes[i]);
        }
    }
}
