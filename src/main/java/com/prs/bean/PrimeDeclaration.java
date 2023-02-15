package com.prs.bean;

import com.ecarx.ai.grammar.criteria.Criterion;
import com.ecarx.ai.grammar.datatype.IntegerRange;
import com.ecarx.ai.grammar.datatype.LengthMode;
import com.ecarx.ai.grammar.datatype.LengthStrategy;
import com.ecarx.ai.grammar.meta.MetaPrime;
import com.ecarx.ai.grammar.parser.SenseParser;
import com.ecarx.ai.grammar.structure.Prime;
import com.ecarx.ai.grammar.utils.AttributeUtil;
import com.ecarx.ai.grammar.utils.DataHelper;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;

public class PrimeDeclaration extends Declaration {
    private Criterion criterion;
    private RuleContext context;

    public RuleContext getContext() {
        return context;
    }

    public boolean isInternal() {
        return null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "internal");
    }

    @Override
    public boolean matchReferenceType(TargetReference.Type type) {
        return type == TargetReference.Type.PRIME;
    }

    public void setContext(RuleContext context) {
        this.context = context;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    public Prime toPrimeStructure() {
        Prime prime = new Prime();

        prime.setExpression(getExpression());

        if(getExclusion() != null)
            prime.setExclusion(getExclusion());

        MetaPrime meta = new MetaPrime();
        meta.setSnippet(getSnippet());
        meta.setQualifiedName(getQualifiedName());

        if(null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "shortest"))
            meta.setLengthStrategy(LengthStrategy.shortest);
        else if(null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "longest"))
            meta.setLengthStrategy(LengthStrategy.longest);

        if(null != AnnotationUtils.findFirstAnnotation(getAnnotations(), "must_validate"))
            meta.setMustValidate(true);

        meta.setNoskip(isNoskip());
        meta.setNullable(isNullable());

        meta.setAttributes(AnnotationUtils.getAttributes(getAnnotations(), "attr"));

        //对transform属性进行特殊处理
        String[] transforms = DataHelper.get(meta.getAttributes(), "transform", String[].class);

        if(transforms != null) {
            meta.getAttributes().remove("transform");
            Map<String,String> trans = new HashMap<>();
            for(String s : transforms) {
                if(s != null && s.length() > 0) {
                    String[] fields = s.split("=>");

                    if(fields.length == 1) {
                        trans.put(fields[0], "");
                    } else if(fields.length >= 2) {
                        trans.put(fields[0], fields[1]);
                    }
                }
            }

            meta.setTransform(trans.size() > 0 ? trans : null);
        }


        Map<String,Object> typeAttr = AnnotationUtils.getAttributes(getAnnotations(), "type");
        if(typeAttr != null) {
            String typeName = AttributeUtil.get(typeAttr, "name", String.class);

            if(typeName != null)
                meta.setPrimeType(typeName);

            Integer minAttr = AttributeUtil.get(typeAttr,"min", Integer.class);
            Integer maxAttr = AttributeUtil.get(typeAttr,"max", Integer.class);
            LengthMode mode = LengthMode.character;
            if ("word".equalsIgnoreCase(AttributeUtil.get(typeAttr, "mode", String.class))) {
                mode = LengthMode.word;
            }
            meta.setLengthMode(mode);

            //Note: a prime must match at lease one character
            int min = minAttr == null ? 1 : minAttr;
            int max = maxAttr == null ? Integer.MAX_VALUE : maxAttr;

            if(max < min)
                max = min;

            if(min != 1 || max != Integer.MAX_VALUE) {
                meta.setRange(IntegerRange.lowerAndUpper(min, max));
            }
        }


        if(criterion != null)
            meta.setCriterion(criterion);

        prime.setMeta(meta);
        return prime;
    }

    @Override
    public Token getNameToken() {
        return ((SenseParser.PrimeSentenceContext) context).name;
    }
}
