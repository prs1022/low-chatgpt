package com.prs.expr;

import java.util.Set;
import java.util.TreeSet;

public class CharListNode extends Node {
    private String chars;

    public String getChars() {
        return chars;
    }

    public void setChars(String chars) {
        this.chars = chars;
    }

    public Set<String> splitToStrings() {
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < chars.length(); i++) {
            String text = chars.substring(i, i + 1);
            set.add(text);
        }

        return set;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof CharListNode) {
            return chars.compareTo(((CharListNode) o).chars);
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
