package com.hanqi.javase.chapter08_oop.demo;

public class ThisDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20, 90.5);
        Student s2 = new Student("李四", 21, 80.5);
        s1.showInfo();
        System.out.println("==========");
        s2.showInfo();
    }
}
