package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class GeneralCourseTeacher extends Teacher {

    public GeneralCourseTeacher() {
    }

    public GeneralCourseTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(super.getName() + " is teaching a general course");
    }
}
