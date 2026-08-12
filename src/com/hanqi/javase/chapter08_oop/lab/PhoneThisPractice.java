package com.hanqi.javase.chapter08_oop.lab;

public class PhoneThisPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple", 5999.0, "黑色");
        Phone p2 = new Phone("Huawei", 4999.0, "白色");
        p1.showInfo();
        System.out.println("==========");
        p2.showInfo();
    }
}
