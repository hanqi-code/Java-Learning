package com.hanqi.javase.chapter08_oop.lab;

public class PhoneObjectPractice {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("Apple");
        p.setPrice(5999.0);
        p.setColor("黑色");

        p.showInfo();
    }
}
