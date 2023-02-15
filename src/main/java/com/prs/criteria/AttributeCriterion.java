package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Map;
import java.util.Set;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AttributeAndCriterion.class, name = "and"),
        @JsonSubTypes.Type(value = AttributeOrCriterion.class, name = "or"),
        @JsonSubTypes.Type(value = AttributeNotCriterion.class, name = "not"),
        @JsonSubTypes.Type(value = AttributeFlagCriterion.class, name = "flag"),
        @JsonSubTypes.Type(value = AttributeVariableCriterion.class, name = "variable")
})
public abstract class AttributeCriterion {
    public abstract boolean validate(Set<String> flags, Map<String,String> vars, IAttributeResolver resolver);
}
