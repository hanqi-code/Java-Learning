package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is purchasing supplies.");
    }
}
