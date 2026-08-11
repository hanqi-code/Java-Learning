package com.hanqi.javase.chapter08_oop.lab;

public class PhoneMultipleObjectPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.price = 5999.0;
        p1.color = "黑色";
        System.out.println("第一个手机：");
        System.out.println("品牌：" + p1.brand);
        System.out.println("价格：" + p1.price);
        System.out.println("颜色：" + p1.color);
        System.out.println();
        Phone p2 = new Phone();
        p2.brand = "Huawei";
        p2.price = 3999.0;
        p2.color = "白色";
        System.out.println("第二个手机：");
        System.out.println("品牌：" + p2.brand);
        System.out.println("价格：" + p2.price);
        System.out.println("颜色：" + p2.color);
    }
}
