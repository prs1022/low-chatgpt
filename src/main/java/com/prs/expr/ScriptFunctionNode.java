package com.prs.expr;

import com.ecarx.ai.grammar.meta.QualifiedName;

public class ScriptFunctionNode extends Node {
    private QualifiedName functionName;

    public QualifiedName getFunctionName() {
        return functionName;
    }

    public void setFunctionName(QualifiedName functionName) {
        this.functionName = functionName;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof ScriptFunctionNode)
            return functionName.compareTo(((ScriptFunctionNode) o).functionName);

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
