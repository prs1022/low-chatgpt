package com.prs.expr;

public class LiteralLookaheadNode extends Node {
    private boolean equals;         //true: ==, false: !=
    private String text;

    public boolean isEquals() {
        return equals;
    }

    public void setEquals(boolean equals) {
        this.equals = equals;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof LiteralLookaheadNode) {
            int result = Boolean.compare(equals, ((LiteralLookaheadNode) o).equals);

            if(result != 0)
                return result;

            return text.compareTo(((LiteralLookaheadNode) o).text);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
