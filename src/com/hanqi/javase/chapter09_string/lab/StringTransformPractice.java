package com.hanqi.javase.chapter09_string.lab;

import java.util.Locale;

public class StringTransformPractice {
    public static void main(String[] args) {
        String file = "JavaLearning.java";
        int start=file.indexOf("Learning");
        int end=file.indexOf(".java");
        String fileName=file.substring(start,end);
        System.out.println(fileName);
        System.out.println(fileName.toUpperCase());
        System.out.println(fileName.toLowerCase());


    }
}
