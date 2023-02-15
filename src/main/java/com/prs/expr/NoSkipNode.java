package com.prs.expr;

public class NoSkipNode extends Node {
    @Override
    public boolean hasNoSkipOrMacroArgument() {
        return true;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof AnyCharNode)
            return 0;

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
