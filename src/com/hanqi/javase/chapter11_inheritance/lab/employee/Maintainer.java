package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String employeeId, String name, String responsibility) {
        super(employeeId, name, responsibility);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is maintaining equipment.");
    }
}
