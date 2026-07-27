package com.hanqi.javase.chapter07_method.demo;

public class MethodOverloadDemo {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
        System.out.println(getSum(10, 20, 30));
        System.out.println(getSum(10.5, 20.5));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}