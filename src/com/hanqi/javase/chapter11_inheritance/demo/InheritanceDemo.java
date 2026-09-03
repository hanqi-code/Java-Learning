package com.hanqi.javase.chapter11_inheritance.demo;

public class InheritanceDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.name = "Steve";
        warrior.level = 10;
        warrior.showInfo();
        warrior.attack();
        System.out.println("-----------------");
        Mage mage = new Mage();
        mage.name = "Alex";
        mage.level = 8;
        mage.showInfo();
        mage.castSpell();
    }
}
