package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class GraduateStudent extends Student {

    public GraduateStudent() {
    }

    public GraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        super.study();
        System.out.println(super.getName()+"攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName()+"正在高级房睡觉");
    }
}
