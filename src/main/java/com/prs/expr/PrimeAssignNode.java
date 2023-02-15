package com.prs.expr;

import com.ecarx.ai.grammar.meta.QualifiedName;

import java.util.Map;

public class PrimeAssignNode extends Node {
    private QualifiedName primeName;
    private Map<String,Object> attributes;
    private String jsonAttr;  // attributes的JSON格式字符串

    public QualifiedName getPrimeName() {
        return primeName;
    }

    public void setPrimeName(QualifiedName primeName) {
        this.primeName = primeName;
    }

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
        if(o instanceof PrimeAssignNode) {
            int result = primeName.compareTo(((PrimeAssignNode) o).primeName);

            if(result != 0)
                return result;

            return jsonAttr.compareTo(((PrimeAssignNode) o).jsonAttr);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
