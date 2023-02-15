package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.ecarx.ai.grammar.lexicon.Word;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NotCriterion extends Criterion {
    @JsonProperty("$not")
    private Criterion criterion;

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean validate(Word word, IAttributeResolver resolver) {
        return criterion != null && !criterion.validate(word, resolver);
    }
}
