package com.prs.bean;

import org.antlr.v4.runtime.RuleContext;

public class ImportDeclaration {
    private String namespaceName;
    private String[] names;
    private RuleContext context;

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public RuleContext getContext() {
        return context;
    }

    public void setContext(RuleContext context) {
        this.context = context;
    }
}
