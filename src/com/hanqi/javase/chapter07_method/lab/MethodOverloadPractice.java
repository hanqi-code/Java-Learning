package com.hanqi.javase.chapter07_method.lab;

public class MethodOverloadPractice {
    public static void main(String[] args) {
        printInfo("张三");
        printInfo("李四", 21);
        printInfo("王五", 20, 1.75);
    }
    public static void printInfo(String name) {
        System.out.println("姓名：" + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    public static void printInfo(String name, int age, double height) {
        System.out.println("姓名：" + name + "，年龄：" + age + "，身高：" + height);
    }

}
