package com.hanqi.javase.chapter10_static_final_enum;

public class Student {
    private String name;
    private static String school="No.1 School";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(school);
    }

    public static void showSchool(){
        System.out.println(school);
    }
}
