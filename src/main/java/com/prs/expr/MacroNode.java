package com.prs.expr;

import com.ecarx.ai.grammar.meta.QualifiedName;

public class MacroNode extends Node {
    private QualifiedName macroName;
    private Node[] arguments;

    public QualifiedName getMacroName() {
        return macroName;
    }

    public void setMacroName(QualifiedName macroName) {
        this.macroName = macroName;
    }

    public Node[] getArguments() {
        return arguments;
    }

    public void setArguments(Node[] arguments) {
        this.arguments = arguments;
    }

    @Override
    public boolean hasNoSkipOrMacroArgument() {
        for(Node node : arguments) {
            if(node.hasNoSkipOrMacroArgument()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof MacroNode) {
            int result = macroName.compareTo(((MacroNode) o).macroName);

            if(result != 0)
                return result;

            return compareNodes(arguments, ((MacroNode) o).arguments);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
