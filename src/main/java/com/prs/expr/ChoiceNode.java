package com.prs.expr;

public class ChoiceNode extends ContainerNode {

    @Override
    public int compareTo(Node o) {
        if(o instanceof ChoiceNode) {
            return compareNodes(nodes, ((ChoiceNode) o).getNodes());
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
