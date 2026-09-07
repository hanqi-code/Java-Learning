package com.hanqi.javase.chapter11_inheritance.lab.employee;

public class EmployeeInheritance {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("T001","Tom","Give lectures");
        lecturer.showInfo();
        lecturer.work();
        System.out.println();
        
        Tutor tutor = new Tutor("T002","Jack","Tutor students");
        tutor.showInfo();
        tutor.work();
        System.out.println();

        Maintainer maintainer = new Maintainer("A001","Mike","Maintain equipment");
        maintainer.showInfo();
        maintainer.work();
        System.out.println();

        Buyer buyer = new Buyer("A002","Lucy","Purchase supplies");
        buyer.showInfo();
        buyer.work();
    }
}
