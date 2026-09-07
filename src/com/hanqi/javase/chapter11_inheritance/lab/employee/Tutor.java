package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is helping students with exercises");
    }
}
