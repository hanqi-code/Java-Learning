package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class Employee {
    private String employeeId;
    private String name;
    private String responsibility;

    public Employee() {
    }

    public Employee(String employeeId, String name, String responsibility) {
        this.employeeId = employeeId;
        this.name = name;
        this.responsibility = responsibility;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public void showInfo(){
        System.out.println("employeeId='" + getEmployeeId() + '\'' +
                ", name='" + getName() + '\'' +
                ", responsibility='" + getResponsibility() + '\'');
    }
    public void work() {
        System.out.println(getName() + " is working.");
    }
}
