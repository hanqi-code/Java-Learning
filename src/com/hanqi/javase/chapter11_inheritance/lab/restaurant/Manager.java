package com.hanqi.javase.chapter11_inheritance.lab.restaurant;

public class Manager extends Employee {
    private double managementBonus;

    public Manager() {
    }

    public Manager(String employeeId, String name, double salary, double managementBonus) {
        super(employeeId, name, salary);
        this.managementBonus = managementBonus;
    }

    public double getManagementBonus() {
        return managementBonus;
    }

    public void setManagementBonus(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "管理其他人");
    }


    public void showInfo() {
        System.out.println("employeeId='" + super.getEmployeeId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() + ", managementBonus=" + managementBonus);
    }
}
