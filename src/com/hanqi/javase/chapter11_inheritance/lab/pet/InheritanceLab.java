package com.hanqi.javase.chapter11_inheritance.lab;

public class InheritanceLab {
    public static void main(String[] args) {
        Dog buddy = new Dog();
        buddy.name = "Buddy";
        buddy.age = 3;
        buddy.showInfo();
        buddy.isAdult();
        buddy.bark();

        System.out.println();

        Cat mini=new Cat();
        mini.name="Mini";
        mini.age=1;
        mini.showInfo();
        mini.isAdult();
        mini.catchMouse();
    }
}
