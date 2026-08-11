package com.hanqi.javase.chapter08_oop.lab;

public class Phone {
    String brand;
    double price;
    String color;

    public void showInfo(){
        System.out.println("手机品牌：" + brand);
        System.out.println("手机价格：" + price);
        System.out.println("手机颜色：" + color);
    }

    public boolean isExpensive(){
        return price >= 5000;
    }
}
