package com.hanqi.javase.chapter11_inheritance.biglab.courseplatform;

public class StudentUser extends User {
    private String grade;

    public StudentUser() {
    }

    public StudentUser(String userId, String name, UserStatus status, String grade) {
        super(userId, name, status);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println(super.getName() + " is studying in " + this.grade + ".");
    }

    @Override
    public void login() {
        System.out.println(getName() + " logged in as a student.");
    }
}
