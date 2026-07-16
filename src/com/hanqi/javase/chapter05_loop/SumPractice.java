package com.hanqi.javase.chapter05_loop;

public class SumPractice {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100 的总和:"+sum);
    }
}
