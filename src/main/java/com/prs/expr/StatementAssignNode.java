package com.prs.expr;

import java.util.Map;

public class StatementAssignNode extends Node {
    private Map<String,Object> attributes;
    private String jsonAttr;  // attributes的JSON格式字符串

    public Map<String,Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String,Object> attributes) {
        this.attributes = attributes;
    }

    public String getJsonAttr() {
        return jsonAttr;
    }

    public void setJsonAttr(String jsonAttr) {
        this.jsonAttr = jsonAttr;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof StatementAssignNode) {
            return jsonAttr.compareTo(((StatementAssignNode) o).jsonAttr);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
