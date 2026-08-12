package com.hanqi.javase.chapter08_oop.demo;

public class StudentObjectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 20, 90.5);
        students[1] = new Student("李四", 21, 85.0);
        students[2] = new Student("王五", 19, 92.0);
        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
            System.out.println();
        }

    }
}
