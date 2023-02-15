package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;
import com.ecarx.ai.grammar.lexicon.Word;
import com.ecarx.ai.grammar.utils.WordUtil;

public class CategoryCriterion extends Criterion {
    public static final char CATEGORY_SEPARATOR = '/';

    private boolean dynamic;
    private String category;
    private AttributeCriterion attributeCriterion;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public AttributeCriterion getAttributeCriterion() {
        return attributeCriterion;
    }

    public void setAttributeCriterion(AttributeCriterion attributeCriterion) {
        this.attributeCriterion = attributeCriterion;
    }

    @Override
    public boolean validate(Word word, IAttributeResolver resolver) {
        if (dynamic) {
            if (resolver == null)
                return false;

            String[] names = resolver.resolve(category);

            if (names == null || names.length == 0)
                return false;

            for (String name : names) {
                if (validateWithWord(word, name, resolver))
                    return true;
            }

            return false;
        } else {
            return validateWithWord(word, category, resolver);
        }
    }

    private boolean validateWithWord(Word word, String catName, IAttributeResolver resolver) {
        return WordUtil.hasCategory(word, catName) && (attributeCriterion == null || attributeCriterion.validate(word.getTags(), word.getVariables(), resolver));
    }
}
