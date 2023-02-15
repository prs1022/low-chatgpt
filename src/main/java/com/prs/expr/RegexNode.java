package com.prs.expr;

public class RegexNode extends Node {
    private String regex;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof RegexNode) {
            return regex.compareTo(((RegexNode) o).regex);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
