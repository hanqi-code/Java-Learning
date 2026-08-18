package com.hanqi.javase.chapter08_oop.lab;

public class PhoneMultipleObjectPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("Apple");
        p1.setPrice(5999.0);
        p1.setColor("黑色");
        System.out.println("第一个手机：");
        p1.showInfo();
        System.out.println();
        Phone p2 = new Phone();
        p2.setBrand("Apple");
        p2.setPrice(5999.0);
        p2.setColor("黑色");
        System.out.println("第二个手机：");
       p2.showInfo();
    }
}
