package com.prs.meta;

import java.util.Objects;

public class MetaClause extends Meta {
    //由@internal标注表明此clause只能在本namespace中引用，不可被外部引用
    private boolean internal;
    private boolean anonymous;

    public boolean isInternal() {
        return internal;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MetaClause) {
            MetaClause m = (MetaClause) obj;

            return this == m || (Objects.equals(getQualifiedName(), m.getQualifiedName())
                    && isInvokeScript() == m.isInvokeScript()
                    && internal == m.internal);
        }
        return false;
    }
}
