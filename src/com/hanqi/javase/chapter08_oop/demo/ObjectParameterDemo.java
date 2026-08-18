package com.hanqi.javase.chapter08_oop.demo;

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setScore(90.5);

        printStudent(s1);
    }

    public static void printStudent(Student stu) {
        stu.showInfo();
    }
}
