package com.hanqi.javase.chapter11_inheritance.biglab.courseplatform;


public class User {
    private String userId;
    private String name;
    private UserStatus status;
    private final static String PLATFORM_NAME = "Hanqi Learning Platform";


    public User() {
    }

    public User(String userId, String name, UserStatus status) {
        this.userId = userId;
        this.name = name;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void showInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
    }

    public void login() {
        System.out.println(name + " logged in.");
    }
}
