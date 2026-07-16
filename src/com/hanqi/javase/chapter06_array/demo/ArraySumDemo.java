package com.hanqi.javase.chapter06_array.demo;

public class ArraySumDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 76, 88, 95};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总分是：" + sum);
    }
}