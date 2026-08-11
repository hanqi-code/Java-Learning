package com.hanqi.javase.chapter08_oop.lab;

public class PhoneMethodPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.price = 5999.0;
        p1.color = "黑色";
        p1.showInfo();
        System.out.println("是否是高价手机：" + p1.isExpensive());
    }
}
