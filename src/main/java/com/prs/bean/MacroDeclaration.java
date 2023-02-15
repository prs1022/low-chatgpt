package com.prs.bean;

import com.ecarx.ai.grammar.parser.SenseParser;
import com.ecarx.ai.grammar.structure.Macro;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

public class MacroDeclaration extends Declaration {
    RuleContext context;
    private String[] args;

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public Macro toMacroStructure() {
        Macro macro = new Macro();
        macro.setSnippet(getSnippet());

        macro.setQualifiedName(getQualifiedName());
        macro.setArguments(args);
        macro.setExpression(getExpression());

        return macro;
    }

    public RuleContext getContext() {
        return context;
    }

    public void setContext(RuleContext context) {
        this.context = context;
    }

    @Override
    public boolean matchReferenceType(TargetReference.Type type) {
        return type == TargetReference.Type.MACRO;
    }

    @Override
    public Token getNameToken() {
        return ((SenseParser.MacroSentenceContext) context).name;
    }
}
