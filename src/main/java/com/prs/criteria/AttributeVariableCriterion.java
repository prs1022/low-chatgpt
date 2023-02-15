package com.prs.criteria;

import com.ecarx.ai.grammar.IAttributeResolver;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class AttributeVariableCriterion extends AttributeCriterion {
    private boolean dynamicName = false;  //是否是动态名字
    private boolean dynamicValue = false;
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDynamicName() {
        return dynamicName;
    }

    public void setDynamicName(boolean dynamicName) {
        this.dynamicName = dynamicName;
    }

    public boolean isDynamicValue() {
        return dynamicValue;
    }

    public void setDynamicValue(boolean dynamicValue) {
        this.dynamicValue = dynamicValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean validate(Set<String> flags, Map<String, String> vars, IAttributeResolver resolver) {
        if(vars == null)
            return false;

        String[] dynamicValues = null;

        if(dynamicValue) {
            if(resolver == null)
                return false;

            dynamicValues = resolver.resolve(value);

            if(dynamicValues == null || dynamicValues.length == 0)
                return false;
        }

        if(dynamicName) {
            if(resolver == null)
                return false;

            String[] names = resolver.resolve(name);

            if(names == null || names.length == 0)
                return false;

            for(String varName : names) {
                if(dynamicValues != null) {
                    if(validateValue(vars, varName, dynamicValues)) {
                        return true;
                    }
                } else if(validateValue(vars, varName, value)) {
                    return true;
                }
            }
            return false;
        } else {
            if(dynamicValues != null) {
                if(validateValue(vars, name, dynamicValues)) {
                    return true;
                }
            } else if(validateValue(vars, name, value)) {
                return true;
            }
        }

        return false;
    }

    private static boolean validateValue(Map<String, String> vars, String varName, String ... varValue) {
        String acturalValue = vars.get(varName);

        for(String v : varValue) {
            if (v.equals("*"))
                return acturalValue != null;

            if(Objects.equals(acturalValue, v))
                return true;
        }

        return false;
    }
}
