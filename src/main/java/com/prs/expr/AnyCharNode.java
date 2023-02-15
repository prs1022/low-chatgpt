package com.prs.expr;

public class AnyCharNode extends Node {
    @Override
    public int compareTo(Node o) {
        if(o instanceof AnyCharNode)
            return 0;

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
