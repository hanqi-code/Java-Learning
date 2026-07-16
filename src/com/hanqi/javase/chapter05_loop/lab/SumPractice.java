package com.hanqi.javase.chapter05_loop.lab;

public class SumPractice {
    public static void main(String[] args) {
        // for方法求1~100 的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("for方法求1~100 的总和:" + sum);
        System.out.println("----------------");
        // while方法求1~100 的和
        sum = 0;
        int j = 1;
        while (j <= 100) {
            sum += j;
            j++;
        }
        System.out.println("while方法求1~100 的总和:" + sum);
    }
}
