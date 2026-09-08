package com.hanqi.javase.chapter11_inheritance.biglab.courseplatform;

public enum UserStatus {
    ACTIVE,
    DISABLED;

    private String status;

    UserStatus() {
    }

    UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
