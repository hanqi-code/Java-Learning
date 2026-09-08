package com.hanqi.javase.chapter11_inheritance.biglab.courseplatform;

public class TeacherUser extends User {
    private String subject;

    public TeacherUser() {
    }

    public TeacherUser(String userId, String name, UserStatus status, String subject) {
        super(userId, name, status);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + " is teaching " + this.subject + ".");
    }

    @Override
    public void login() {
        System.out.println(getName() + " logged in as a teacher.");
    }
}
