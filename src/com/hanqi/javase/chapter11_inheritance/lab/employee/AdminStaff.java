package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }
}
