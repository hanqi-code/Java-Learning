package com.hanqi.javase.chapter09_string.lab;

public class StringSubstringPractice {
    public static void main(String[] args) {
        String file = "JavaLearning.java";
        int index = file.indexOf("Learning.java");
        System.out.println(file.substring(index));
    }
}
