package com.hanqi.javase.chapter11_inheritance.lab;

public class PhoneRewriteLab {
    public static void main(String[] args) {
        Phone1 p1=new Phone1();
        p1.call();
        System.out.println();

        Phone2 p2=new Phone2();
        p2.call();
        p2.sendMessage();
        System.out.println();

        Phone3 p3=new Phone3();
        p3.call();
        p3.sendMessage();
        p3.playGame();
    }
}
