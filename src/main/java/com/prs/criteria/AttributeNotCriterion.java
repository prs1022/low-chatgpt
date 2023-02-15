package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Set;

public class AttributeNotCriterion extends AttributeCriterion {
    @JsonProperty("$not")
    private AttributeCriterion criterion;

    public AttributeCriterion getCriterion() {
        return criterion;
    }

    public void setCriterion(AttributeCriterion criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean validate(Set<String> flags, Map<String, String> vars, IAttributeResolver resolver) {
        return criterion != null && !criterion.validate(flags, vars, resolver);
    }
}
