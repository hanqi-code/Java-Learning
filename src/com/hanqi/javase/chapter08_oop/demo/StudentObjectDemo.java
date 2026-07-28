package com.hanqi.javase.chapter08_oop.demo;

public class StudentObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 20;
        s.score = 90.5;
        System.out.println("姓名：" + s.name);
        System.out.println("年龄：" + s.age);
        System.out.println("成绩：" + s.score);
    }
}
