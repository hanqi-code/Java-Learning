package com.hanqi.javase.chapter09_string.lab;

public class StringSecondIndexPractice {
    public static void main(String[] args) {
        String text = "Java Python Java JavaScript";
        int firstIndex = text.indexOf("Java");
        int secondIndex = text.indexOf("Java", firstIndex + 1);
        System.out.println(firstIndex);
        System.out.println(secondIndex);
    }
}
