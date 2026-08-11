package com.hanqi.javase.chapter08_oop.demo;

public class Student {
    String name;
    int age;
    double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void showInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + score);
    }
    public boolean isPass() {
        return score >= 60;
    }
}
