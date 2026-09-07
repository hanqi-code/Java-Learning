package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }
}
