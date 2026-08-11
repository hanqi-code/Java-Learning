package com.hanqi.javase.chapter08_oop.demo;

public class StudentMultipleObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 20;
        s1.score = 90.5;

        System.out.println("第一个学生：");
        System.out.println("姓名：" + s1.name);
        System.out.println("年龄：" + s1.age);
        System.out.println("成绩：" + s1.score);
        System.out.println();

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 21;
        s2.score = 85.0;
        System.out.println("第二个学生：");
        System.out.println("姓名：" + s2.name);
        System.out.println("年龄：" + s2.age);
        System.out.println("成绩：" + s2.score);
    }
}