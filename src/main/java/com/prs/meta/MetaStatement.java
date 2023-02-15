package com.prs.meta;

import java.util.Objects;

public class MetaStatement extends Meta {
    private boolean mustValidate = false;   //如果验证不通过，则整条匹配结果被丢弃

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MetaStatement) {
            MetaStatement m = (MetaStatement) obj;

            return this == m || (Objects.equals(getQualifiedName(), m.getQualifiedName())
                    && isInvokeScript() == m.isInvokeScript());
        }
        return false;
    }

    public boolean isMustValidate() {
        return mustValidate;
    }

    public void setMustValidate(boolean mustValidate) {
        this.mustValidate = mustValidate;
    }
}
