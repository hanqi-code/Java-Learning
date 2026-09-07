package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is teaching Java courses");
    }
}
