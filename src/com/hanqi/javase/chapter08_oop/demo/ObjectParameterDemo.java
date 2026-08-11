package com.hanqi.javase.chapter08_oop.demo;

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 20;
        s1.score = 90.5;

        printStudent(s1);
    }

    public static void printStudent(Student stu) {
        System.out.println("姓名：" + stu.name);
        System.out.println("年龄：" + stu.age);
        System.out.println("成绩：" + stu.score);
    }
}
