package com.hanqi.javase.chapter09_string.demo;

public class StringBuilderBasicDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.append("+");
        sb.append("Python");
        System.out.println(sb);
    }
}
