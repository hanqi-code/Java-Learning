package com.hanqi.javase.chapter08_oop.demo;

public class StudentMultipleObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setScore(90.5);

        System.out.println("第一个学生：");
        s1.showInfo();
        System.out.println();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(21);
        s2.setScore(85.0);
        System.out.println("第二个学生：");
        s2.showInfo();
    }
}