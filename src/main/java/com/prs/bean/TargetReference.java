package com.prs.bean;

import com.prs.expr.Node;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * 语法定义中对prime, clause, macro的引用实例
 */
public class TargetReference {
    public enum Type {
        CLAUSE,
        PRIME,
    }

    private Type type;
    private TerminalNode namespaceNode; //引用时如果指定了namesapce，则此值不为空
    private TerminalNode nameNode;

    private Node refNode;

    //查找到的引用对象定义
    private Declaration resolvedTarget = null;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TerminalNode getNamespaceNode() {
        return namespaceNode;
    }

    public void setNamespaceNode(TerminalNode namespaceNode) {
        this.namespaceNode = namespaceNode;
    }

    public TerminalNode getNameNode() {
        return nameNode;
    }

    public void setNameNode(TerminalNode nameNode) {
        this.nameNode = nameNode;
    }

    public Declaration getResolvedTarget() {
        return resolvedTarget;
    }

    public void setResolvedTarget(Declaration resolvedTarget) {
        this.resolvedTarget = resolvedTarget;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }
}
