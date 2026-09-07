package com.hanqi.javase.chapter11_inheritance.lab.restaurant;

public class RestaurantInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("Moo1","Tom",12000,3000);
        System.out.println("===== Manager =====");
        manager.showInfo();
        manager.work();
        manager.eat();
        System.out.println();

        Chef chef = new Chef("Coo2","Jack",8000);
        System.out.println("===== Chef =====");
        chef.showInfo();
        chef.work();
        chef.eat();
    }
}
