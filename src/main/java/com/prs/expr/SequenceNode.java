package com.prs.expr;

import java.util.Arrays;

public class SequenceNode extends ContainerNode {

    @Override
    public int compareTo(Node o) {
        if(o instanceof SequenceNode) {
            return compareNodes(nodes, ((SequenceNode) o).getNodes());
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }

    public SequenceNode subsequence(int offset, int length) {
        if(offset < 0 || length <= 0 || offset + length > nodes.length) {
            throw new IndexOutOfBoundsException();
        }

        SequenceNode sequenceNode = new SequenceNode();
        sequenceNode.setNodes(Arrays.copyOfRange(nodes, offset, offset + length));

        return sequenceNode;
    }
}
