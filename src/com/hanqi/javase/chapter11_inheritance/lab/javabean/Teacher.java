package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class Teacher extends Person {

    public Teacher(){

    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teach() {
        System.out.println(super.getName()+ " is teaching");
    }
}
