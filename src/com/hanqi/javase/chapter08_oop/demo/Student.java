package com.hanqi.javase.chapter08_oop.demo;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        setAge(age);
        setScore(score);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150){
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100){
            this.score = score;
        }else {
            System.out.println("成绩不合法");
        }

    }

    public double getScore() {
        return score;
    }
    public void showInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + score);
    }
    public boolean isPass() {
        return score >= 60;
    }
}
