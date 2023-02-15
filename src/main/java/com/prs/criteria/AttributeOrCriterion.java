package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Set;

public class AttributeOrCriterion extends AttributeCriterion {
    @JsonProperty("$or")
    private AttributeCriterion[] criteria;

    public AttributeCriterion[] getCriteria() {
        return criteria;
    }

    public void setCriteria(AttributeCriterion[] criteria) {
        this.criteria = criteria;
    }

    @Override
    public boolean validate(Set<String> flags, Map<String, String> vars, IAttributeResolver resolver) {
        if(criteria == null || criteria.length == 0)
            return true;   //没有任何条件，就意味着满足条件

        for(AttributeCriterion c : criteria) {
            if(c.validate(flags, vars, resolver))
                return true;
        }

        return false;
    }
}
