package com.hanqi.javase.chapter11_inheritance.lab;

public class Teacher extends Person {
     String object;

    public Teacher() {
    }

    public Teacher(String name, int age, String object) {
        super(name, age);
        this.object = object;
    }
}
