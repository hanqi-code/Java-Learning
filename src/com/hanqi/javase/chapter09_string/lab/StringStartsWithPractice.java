package com.hanqi.javase.chapter09_string.lab;

public class StringStartsWithPractice {
    public static void main(String[] args) {
        String file = "JavaLearning.java";
        System.out.println(file.startsWith("Java"));
        System.out.println(file.startsWith("python"));
        System.out.println(file.startsWith("java"));
    }
}
