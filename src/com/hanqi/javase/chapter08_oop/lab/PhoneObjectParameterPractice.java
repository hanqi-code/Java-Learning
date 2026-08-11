package com.hanqi.javase.chapter08_oop.lab;

public class PhoneObjectParameterPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.price = 5999.0;
        p1.color = "黑色";
        System.out.println("修改前");
        printPhone(p1);
        System.out.println();
        System.out.println("修改后");
        changePrice(p1);
        printPhone(p1);
    }

    public static void printPhone(Phone p){
        System.out.println("手机品牌：" + p.brand);
        System.out.println("手机价格：" + p.price);
        System.out.println("手机颜色：" + p.color);
    }
    public static void changePrice(Phone p){
        p.price = 4999.0;
    }
}
