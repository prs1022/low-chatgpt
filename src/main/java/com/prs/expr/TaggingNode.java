package com.prs.expr;

public class TaggingNode extends Node {
    private String[] tagNames;

    public String[] getTagNames() {
        return tagNames;
    }

    public void setTagNames(String[] tagNames) {
        this.tagNames = tagNames;
    }

    @Override
    public int compareTo(Node o) {
        if(o instanceof TaggingNode) {
            int i = 0;

            String[] otherTagNames = ((TaggingNode) o).tagNames;

            for(; i < tagNames.length && i < otherTagNames.length; i++) {
                int comp = tagNames[i].compareTo(otherTagNames[i]);

                if(comp != 0)
                    return comp;
            }

            if(i == tagNames.length && i == otherTagNames.length) {
                return 0;
            }

            if(i == tagNames.length)
                return -1;

            return 1;
        }

        return getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
    }
}
