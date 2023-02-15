package com.prs.meta;

import com.ecarx.ai.grammar.datatype.Snippet;
import com.ecarx.ai.grammar.text.CharGroup;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;


@XmlRootElement(name="meta")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MetaClause.class, name = "clause"),
        @JsonSubTypes.Type(value = MetaStatement.class, name = "statement"),
        @JsonSubTypes.Type(value = MetaPrime.class, name = "prime"),
})
public abstract class Meta {
    private QualifiedName qualifiedName;
    private boolean invokeScript;
    private Map<String,Object> attributes;
    private boolean noskip;
    private CharGroup headGroup;
    private CharGroup tailGroup;
    private boolean nullable;
    private Snippet snippet;

    //如果当前产生式的任何路径都不包含通配字符，则其可能匹配的字符是一个有限集合。本
    //字符串存放排序后的所有这些字符。
    private char[] closedChars;

    private int leastLength;

    public QualifiedName getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(QualifiedName qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public boolean isInvokeScript() {
        return invokeScript;
    }

    public void setInvokeScript(boolean invokeScript) {
        this.invokeScript = invokeScript;
    }

    public boolean isNoskip() {
        return noskip;
    }

    public void setNoskip(boolean noskip) {
        this.noskip = noskip;
    }

    public Map<String,Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String,Object> attributes) {
        this.attributes = attributes;
    }

    public char[] getClosedChars() {
        return closedChars;
    }

    public void setClosedChars(char[] closedChars) {
        this.closedChars = closedChars;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public CharGroup getHeadGroup() {
        return headGroup;
    }

    public void setHeadGroup(CharGroup headGroup) {
        this.headGroup = headGroup;
    }

    public CharGroup getTailGroup() {
        return tailGroup;
    }

    public void setTailGroup(CharGroup tailGroup) {
        this.tailGroup = tailGroup;
    }

    public int getLeastLength() {
        return leastLength;
    }

    public void setLeastLength(int leastLength) {
        this.leastLength = leastLength;
    }
}
