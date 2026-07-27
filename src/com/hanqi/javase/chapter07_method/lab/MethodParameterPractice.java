package com.hanqi.javase.chapter07_method.lab;

public class MethodParameterPractice {
    public static void main(String[] args) {
        printStudentScore("张三", 90);
        printStudentScore("李四", 85);
        printStudentScore("王五", 76);
    }

    public static void printStudentScore(String name, int score) {
        System.out.println(name+"的成绩是："+ score);
    }
}
