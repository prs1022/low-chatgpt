package com.prs.bean;

import com.ecarx.ai.grammar.meta.MetaClause;
import com.ecarx.ai.grammar.meta.MetaStatement;
import com.ecarx.ai.grammar.parser.SenseParser;
import com.ecarx.ai.grammar.structure.Clause;
import com.ecarx.ai.grammar.structure.Statement;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

public class ProductionDeclaration extends Declaration {
    private RuleContext context;
    private boolean anonymous = false;  //某些情况下会生成匿名clause，例如某些宏调用的参数块。

    public RuleContext getContext() {
        return context;
    }

    public void setContext(RuleContext context) {
        this.context = context;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    /**
     * 使用@statement来判断是语句还是子句
     * @return
     */
    public boolean isStatement() {
        return null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "statement");
    }

    public Statement toStatementStructure() {
        if(isStatement()) {
            Statement statement = new Statement();
            statement.setExpression(getExpression());

            if(getExclusion() != null)
                statement.setExclusion(getExclusion());

            MetaStatement meta = new MetaStatement();
            meta.setSnippet(getSnippet());
            meta.setAttributes(AnnotationUtils.getAttributes(getAnnotations(), "attr"));
            meta.setQualifiedName(getQualifiedName());
            meta.setNoskip(isNoskip());
            meta.setNullable(isNullable());

            if(null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "must_validate"))
                meta.setMustValidate(true);

            statement.setMeta(meta);
            return statement;
        }

        return null;
    }

    public Clause toClauseSructure() {
        if(!isStatement()) {
            Clause prod = new Clause();

            MetaClause meta = new MetaClause();
            meta.setSnippet(getSnippet());
            meta.setQualifiedName(getQualifiedName());
            meta.setInternal(isInternal());
            meta.setNoskip(isNoskip());
            // if it's anonymous clause, it should be nullable.
            meta.setNullable(isNullable() || anonymous);
            meta.setAnonymous(anonymous);

            prod.setMeta(meta);
            prod.setExpression(getExpression());

            if(getExclusion() != null)
                prod.setExclusion(getExclusion());

            return prod;
        }

        return null;
    }

    @Override
    public boolean matchReferenceType(TargetReference.Type type) {
        return type == TargetReference.Type.CLAUSE && !isStatement();
    }

    @Override
    public Token getNameToken() {
        return ((SenseParser.ProductionSentenceContext) context).name;
    }
}
