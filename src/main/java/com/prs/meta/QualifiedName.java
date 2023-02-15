package com.prs.meta;


import java.util.Objects;

public class QualifiedName implements Comparable<QualifiedName> {
    private String namespaceName;
    private String name;
    private String fullName = "::";

    public QualifiedName()
    {

    }

    public QualifiedName(String namespaceName, String name)
    {
        this.namespaceName = namespaceName;
        this.name = name;
        updateFullName();
    }

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        updateFullName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        updateFullName();
    }

    public String getFullName() {
        return fullName;
    }

    private void updateFullName() {
        StringBuilder sb = new StringBuilder();
        if(namespaceName != null) {
            sb.append(namespaceName);
            sb.append("::");
        }

        if(name != null) {
            sb.append(name);
        }

        this.fullName = sb.toString();
    }

    public static QualifiedName valueOf(String fullname) {
        if(fullname != null) {
            int pos = fullname.indexOf("::");
            if(pos >= 0) {
                String namespace = fullname.substring(0, pos);
                String name = fullname.substring(pos + 2);

                if(!namespace.isEmpty() && !name.isEmpty()) {
                    return new QualifiedName(namespace, name);
                }
            }
        }

        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof QualifiedName){
            QualifiedName o = (QualifiedName)obj;
            return Objects.equals(namespaceName, o.namespaceName) && Objects.equals(name, o.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public int compareTo(QualifiedName qualifiedName) {
        return fullName.compareTo(qualifiedName.fullName);
    }
}
