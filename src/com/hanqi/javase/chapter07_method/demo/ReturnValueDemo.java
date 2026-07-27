package com.hanqi.javase.chapter07_method.demo;

public class ReturnValueDemo {
    public static void main(String[] args) {
        int result = getSum(10, 20);
        System.out.println("结果是：" + result);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}