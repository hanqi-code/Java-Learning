package com.hanqi.javase.chapter11_inheritance.lab.restaurant;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "炒饭");
    }


}
