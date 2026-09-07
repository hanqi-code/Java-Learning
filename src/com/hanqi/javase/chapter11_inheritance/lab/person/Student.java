package com.hanqi.javase.chapter11_inheritance.lab;

public class Student extends Person {
    String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
}
