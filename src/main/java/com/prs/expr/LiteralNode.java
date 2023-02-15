package com.prs.expr;

public class LiteralNode extends Node {
    private String text;

    // 该字段用于表示当前字符串是否和前面的内容为连续字符;
    private boolean continuous;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isContinuous() {
        return continuous;
    }

    public void setContinuous(boolean continuous) {
        this.continuous = continuous;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof LiteralNode) {
            return text.compareTo(((LiteralNode) o).text);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
