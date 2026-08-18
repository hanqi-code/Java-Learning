package com.hanqi.javase.chapter09_string.lab;

public class StringBuilderReversePractice {
    public static void main(String[] args) {
        String word = "Minecraft";
        StringBuilder sb = new StringBuilder("Minecraft");

        System.out.println(word);
        System.out.println(sb.reverse().toString());
    }
}
