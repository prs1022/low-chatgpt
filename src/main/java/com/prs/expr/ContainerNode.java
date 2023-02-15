package com.prs.expr;

import java.util.Arrays;
import java.util.Iterator;

public abstract class ContainerNode extends Node implements Iterable<Node> {
    protected Node[] nodes;

    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes == null ? new Node[0] : nodes;
    }

    @Override
    public Iterator<Node> iterator()
    {
        return Arrays.asList(nodes).iterator();
    }

    @Override
    public boolean hasNoSkipOrMacroArgument() {
        for(Node node : nodes) {
            if(node.hasNoSkipOrMacroArgument())
                return true;
        }
        return false;
    }
}
