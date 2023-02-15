package com.prs.meta;

import com.ecarx.ai.grammar.criteria.Criterion;
import com.ecarx.ai.grammar.datatype.IntegerRange;
import com.ecarx.ai.grammar.datatype.LengthMode;
import com.ecarx.ai.grammar.datatype.LengthStrategy;

import java.util.Map;
import java.util.Objects;

public class MetaPrime extends Meta {
    private String primeType;
    private IntegerRange range;
    private Criterion criterion;
    private LengthStrategy lengthStrategy = LengthStrategy.any;
    private LengthMode lengthMode = LengthMode.character;
    private boolean mustValidate = false;   //如果验证不通过，则整条匹配结果被丢弃

    private Map<String,String> transform = null;

    public String getPrimeType() {
        return primeType;
    }

    public void setPrimeType(String primeType) {
        this.primeType = primeType;
    }

    public IntegerRange getRange() {
        return range;
    }

    public void setRange(IntegerRange range) {
        this.range = range;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    public Map<String, String> getTransform() {
        return transform;
    }

    public void setTransform(Map<String, String> transform) {
        this.transform = transform;
    }

    public LengthStrategy getLengthStrategy() {
        return lengthStrategy;
    }

    public void setLengthStrategy(LengthStrategy lengthStrategy) {
        this.lengthStrategy = lengthStrategy;
    }

    public LengthMode getLengthMode() {
        return lengthMode;
    }

    public void setLengthMode(LengthMode lengthMode) {
        this.lengthMode = lengthMode;
    }

    public boolean isMustValidate() {
        return mustValidate;
    }

    public void setMustValidate(boolean mustValidate) {
        this.mustValidate = mustValidate;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MetaPrime) {
            MetaPrime m = (MetaPrime) obj;

            return this == m || (Objects.equals(getQualifiedName(), m.getQualifiedName())
                    && Objects.equals(primeType, m.primeType)
                    && isInvokeScript() == m.isInvokeScript()
                    && Objects.equals(range, m.range)
                    && lengthStrategy == m.lengthStrategy
                    && lengthMode == m.lengthMode);
        }
        return false;
    }
}
