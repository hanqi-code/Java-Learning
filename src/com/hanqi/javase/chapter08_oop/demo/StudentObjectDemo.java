package com.hanqi.javase.chapter08_oop.demo;

public class StudentObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        s.setScore(90.5);
        s.showInfo();
    }
}
