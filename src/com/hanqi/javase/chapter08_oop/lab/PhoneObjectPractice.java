package com.hanqi.javase.chapter08_oop.lab;

public class PhoneObjectPractice {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Apple";
        p.price = 5999.0;
        p.color = "黑色";

        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price);
        System.out.println("颜色：" + p.color);
    }
}
