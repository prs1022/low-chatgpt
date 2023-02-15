package com.prs.expr;

import com.ecarx.ai.grammar.meta.QualifiedName;

public class ReferenceNode extends Node {
    private QualifiedName clauseName;

    /**
     * alias name to hold script running result
     */
    private String alias;

    public QualifiedName getClauseName() {
        return clauseName;
    }

    public void setClauseName(QualifiedName clauseName) {
        this.clauseName = clauseName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof ReferenceNode)
            return clauseName.compareTo(((ReferenceNode) o).clauseName);

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
