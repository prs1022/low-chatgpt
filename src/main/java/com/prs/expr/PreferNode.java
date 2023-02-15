package com.prs.expr;

public class PreferNode extends Node {
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof PreferNode) {
            if(node == null && ((PreferNode)o).node == null)
                return 0;

            if(node == null)
                return -1;

            int result = node.compareTo(((PreferNode) o).node);

            if(result != 0)
                return result;

            return 0;
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
