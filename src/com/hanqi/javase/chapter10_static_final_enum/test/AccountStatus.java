package com.hanqi.javase.chapter10_static_final_enum.test;

public enum AccountStatus {
    NORMAL("正常"),
    BANNED("封禁"),
    CANCELLED("注销");
    private String status;


    AccountStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}
