package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.ecarx.ai.grammar.lexicon.Word;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrCriterion extends Criterion {
    @JsonProperty("$or")
    private Criterion[] criteria;

    public Criterion[] getCriteria() {
        return criteria;
    }

    public void setCriteria(Criterion[] criteria) {
        this.criteria = criteria;
    }

    @Override
    public boolean validate(Word word, IAttributeResolver resolver) {
        if(criteria == null || criteria.length == 0)
            return true;   //没有任何条件，就意味着满足条件

        try {
            for (Criterion c : criteria) {
                if (c.validate(word, resolver))
                    return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
