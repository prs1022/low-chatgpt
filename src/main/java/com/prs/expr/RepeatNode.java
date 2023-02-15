package com.prs.expr;

import com.ecarx.ai.grammar.datatype.IntegerRange;

public class RepeatNode extends Node {
    private Node node;
    private IntegerRange range;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public IntegerRange getRange() {
        return range;
    }

    public void setRange(IntegerRange range) {
        this.range = range;
    }

    @Override
    public boolean hasNoSkipOrMacroArgument() {
        return node.hasNoSkipOrMacroArgument();
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof RepeatNode) {
            int result = node.compareTo(((RepeatNode) o).node);

            if(result != 0)
                return result;

            return range.compareTo(((RepeatNode) o).range);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
