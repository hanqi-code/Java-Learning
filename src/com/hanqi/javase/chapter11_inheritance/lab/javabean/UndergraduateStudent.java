package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent() {
    }

    public UndergraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        super.study();
        System.out.println(super.getName() + "攻读学士学位");
    }
}
