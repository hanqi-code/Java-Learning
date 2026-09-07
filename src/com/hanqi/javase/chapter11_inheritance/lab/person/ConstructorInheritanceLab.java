package com.hanqi.javase.chapter11_inheritance.lab;

public class ConstructorInheritanceLab {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 18, "一年级");
        System.out.println(tom.name + " " + tom.age + " " + tom.grade);

        Teacher teacher = new Teacher("Jack", 30, "Math");
        System.out.println(teacher.name + " " + teacher.age + " " + teacher.object);
    }
}
