package com.hanqi.javase.chapter09_string.lab;

public class StringCleanPractice {
    public static void main(String[] args) {
        String text = "   I like Java   ";
        System.out.println(text);
        System.out.println(text.trim());
        System.out.println(text.trim().replace("Java","Python"));

    }
}
