package com.prs.expr;

import com.ecarx.ai.grammar.datatype.Snippet;

public abstract class Node implements Comparable<Node> {
    private Snippet snippet;

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public boolean hasNoSkipOrMacroArgument() {
        return false;
    }

    final protected int compareNodes(Node[] nodes, Node[] otherNodes) {
        int i = 0;
        for(; i < nodes.length && i < otherNodes.length; i++) {
            int comp = nodes[i].compareTo(otherNodes[i]);

            if(comp != 0)
                return comp;
        }

        if(i == nodes.length && i == otherNodes.length) {
            return 0;
        }

        if(i == nodes.length)
            return -1;

        return 1;
    }
}
