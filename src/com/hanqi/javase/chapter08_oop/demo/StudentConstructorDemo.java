package com.hanqi.javase.chapter08_oop.demo;

public class StudentConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setScore(90.5);
        s1.showInfo();

        System.out.println("==========");

        Student s2 = new Student("李四", 21, 85.0);
        s2.showInfo();
    }
}
