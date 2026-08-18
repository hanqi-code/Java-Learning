package com.hanqi.javase.chapter08_oop.lab;

public class PhoneObjectParameterPractice {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("Apple");
        p1.setPrice(5999.0);
        p1.setColor("黑色");
        System.out.println("修改前");
        printPhone(p1);
        System.out.println();
        System.out.println("修改后");
        changePrice(p1);
        printPhone(p1);
    }

    public static void printPhone(Phone p){
        p.showInfo();
    }
    public static void changePrice(Phone p){
        p.setPrice(4999.0);
    }
}
