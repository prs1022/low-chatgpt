package com.prs.expr;

public class MacroArgumentNode extends Node {
    private String argName;
    private int argIndex = -1;

    public String getArgName() {
        return argName;
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

    public int getArgIndex() {
        return argIndex;
    }

    public void setArgIndex(int argIndex) {
        this.argIndex = argIndex;
    }

    @Override
    public boolean hasNoSkipOrMacroArgument() {
        return true;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof MacroArgumentNode) {
            return Integer.compare(argIndex, ((MacroArgumentNode) o).argIndex);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
