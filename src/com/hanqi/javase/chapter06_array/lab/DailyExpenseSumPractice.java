package com.hanqi.javase.chapter06_array.lab;

public class DailyExpenseSumPractice {
    public static void main(String[] args) {
        double[] expenses = {12.5,18.0,9.9,20.0,15.5};
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("总消费为：" + sum);
    }
}
