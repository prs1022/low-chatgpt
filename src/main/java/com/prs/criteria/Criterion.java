package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.ecarx.ai.grammar.lexicon.Word;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AndCriterion.class, name = "and"),
        @JsonSubTypes.Type(value = NotCriterion.class, name = "not"),
        @JsonSubTypes.Type(value = OrCriterion.class, name = "or"),
        @JsonSubTypes.Type(value = CategoryCriterion.class, name = "category"),
})
public abstract class Criterion {
    public abstract boolean validate(Word word, IAttributeResolver resolver);
}
