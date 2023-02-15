package com.prs.bean;

import java.util.*;

public class AnnotationUtils {
    private static Set<String> validAnnotations = new HashSet<String>() {
        {
            add("attr");      //仅用于prime 和 statement
            add("internal");  //仅用于从句
            add("statement"); //仅用于statement
            add("type");      //仅用于prime
            add("shortest");  //仅用于prime
            add("longest");  //仅用于prime
            add("must_validate"); //仅用于prime
            add("noskip");
            add("nullable");  //为true时才允许该表达式匹配空串
        }
    };

    /**
     * 从@attr(...)中提取Attributes
     * @param annotations
     * @return
     */
    public static Map<String,Object> getAttributes(Annotation[] annotations, String name)
    {
        Map<String,Object> result = new HashMap<>();

        for(Annotation a : findAnnotations(annotations, name)) {
            if(a.getAttributes() != null)
                result.putAll(a.getAttributes());
        }

        return result.size() == 0 ? null : result;
    }

    /**
     * 在列表中找到第一个同名的annotation
     * @param annotations
     * @param name
     * @return
     */
    public static Annotation findFirstAnnotation(Annotation[] annotations, String name)
    {
        if(annotations != null && name != null) {
            for(Annotation a : annotations) {
                if(name.equals(a.getName())) {
                    return a;
                }
            }
        }
        return null;
    }

    /**
     * 在列表中所有同名的annotation，没有则返回空数组
     * @param annotations
     * @param name
     * @return
     */
    public static Annotation[] findAnnotations(Annotation[] annotations, String name)
    {
        if(annotations != null && name != null) {
            return Arrays.stream(annotations).filter(annotation -> name.equals(annotation.getName())).toArray(Annotation[]::new);
        }
        return new Annotation[0];
    }

    /**
     * 判断当前是否支持给定的annotation name
     * @param name
     * @return
     */
    public static boolean isValid(String name)
    {
        return name != null && validAnnotations.contains(name);
    }
}
