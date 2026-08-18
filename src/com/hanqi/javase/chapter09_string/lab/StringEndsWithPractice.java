package com.hanqi.javase.chapter09_string.lab;

public class StringEndsWithPractice {
    public static void main(String[] args) {
        String file = "JavaLearning.java";
        System.out.println(file.endsWith("java"));
        System.out.println(file.endsWith("Learning"));
        System.out.println(file.endsWith("Python"));
    }
}
