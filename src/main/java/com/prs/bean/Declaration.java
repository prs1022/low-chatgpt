package com.prs.bean;

import com.prs.expr.Expression;
import jdk.jshell.Snippet;
import org.antlr.v4.runtime.Token;

public abstract class Declaration {
    private String name;
    private Expression expression;
    private Annotation[] annotations;
    private Expression exclusion;
    private Snippet snippet;

    public Annotation[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotation[] annotations) {
        this.annotations = annotations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public boolean isInternal() {
        return null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "internal");
    }

    public boolean isNoskip() {
        return null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "noskip");
    }

    public boolean isNullable() {
        return null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "nullable");
    }


    public boolean isPublic() {
        return !isInternal();
    }


    public QualifiedName getQualifiedName() {
        QualifiedName qName = new QualifiedName();
        qName.setName(name);
        qName.setNamespaceName(file.getNamespaceName());
        return qName;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public Expression getExclusion() {
        return exclusion;
    }

    public void setExclusion(Expression exclusion) {
        this.exclusion = exclusion;
    }

    public abstract boolean matchReferenceType(TargetReference.Type type);

    public abstract Token getNameToken();
}
