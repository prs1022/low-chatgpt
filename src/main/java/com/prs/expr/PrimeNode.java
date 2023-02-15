package com.prs.expr;

import com.ecarx.ai.grammar.meta.QualifiedName;

public class PrimeNode extends Node {
    private QualifiedName primeName;

    private String alias;

    public QualifiedName getPrimeName() {
        return primeName;
    }

    public void setPrimeName(QualifiedName primeName) {
        this.primeName = primeName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof PrimeNode) {
            int result = primeName.compareTo(((PrimeNode) o).primeName);

            if(result != 0)
                return result;

            if(alias == null) {
                if(((PrimeNode) o).alias == null)
                    return 0;

                return -1;
            } else {
                if(((PrimeNode) o).alias == null)
                    return 1;

                return alias.compareTo(((PrimeNode) o).alias);
            }
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
