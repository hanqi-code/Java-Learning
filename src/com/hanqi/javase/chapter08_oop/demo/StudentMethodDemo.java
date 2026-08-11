package com.hanqi.javase.chapter08_oop.demo;

public class StudentMethodDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 20;
        s1.score = 90.5;
        s1.showInfo();
        System.out.println("是否通过：" + s1.isPass());
    }
}
