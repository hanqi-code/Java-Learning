package com.hanqi.javase.chapter10_static_final_enum;

public class StaticAccessPractice {
    public static void main(String[] args) {
        Student tom = new Student("Tom");
        Student jack = new Student("Jack");

        tom.showInfo();
        jack.showInfo();

        System.out.println();
        Student.showSchool();
    }
}
