package com.prs.bean;

import java.util.Map;

public class Annotation {
    private String name;
    private Map<String,Object> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String,Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String,Object> attributes) {
        this.attributes = attributes;
    }
}
