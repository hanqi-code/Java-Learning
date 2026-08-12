package com.hanqi.javase.chapter08_oop.demo;

public class PrivateDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20, 90.5);
        s1.showInfo();
        System.out.println("==========");
        s1.setAge(-100);
        s1.setScore(9999);

        s1.showInfo();
    }
}
