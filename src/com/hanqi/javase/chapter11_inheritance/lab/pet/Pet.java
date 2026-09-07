package com.hanqi.javase.chapter11_inheritance.lab;

public class Pet {
    String name;
    int age;

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void isAdult(){
        if(age >= 2){
            System.out.println(name + " is an adult.");
        }else{
            System.out.println(name + " is not an adult.");
        }
    }
}
