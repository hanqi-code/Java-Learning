package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class MajorCourseTeacher extends Teacher {
    private String subject;

    public MajorCourseTeacher() {
    }

    public MajorCourseTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println(super.getName() + " is teaching " + subject);
    }
}
