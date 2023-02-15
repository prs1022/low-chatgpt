package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;

import java.util.Map;
import java.util.Set;

public class AttributeFlagCriterion extends AttributeCriterion {
    private String flag;
    private boolean dynamic = false;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    @Override
    public boolean validate(Set<String> flags, Map<String, String> vars, IAttributeResolver resolver) {
        if(dynamic) {
            if(resolver == null)
                return false;

            String[] names = resolver.resolve(flag);

            if(names == null || names.length == 0)
                return false;

            for(String name : names) {
                if(flags.contains(name))
                    return true;
            }

            return false;
        } else {
            return flag != null && flags != null && flags.contains(flag);
        }
    }
}
