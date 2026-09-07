package com.hanqi.javase.chapter11_inheritance.lab.phone;

public class Phone3 extends Phone2{
    @Override
    public void call() {
        System.out.println("Phone is calling...");
        System.out.println("video call");
    }

    public void playGame() {
        System.out.println("Phone is playing game...");
    }
}
