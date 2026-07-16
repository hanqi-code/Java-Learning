package com.hanqi.javase.chapter05_loop.lab;

public class EvenCountPractice {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("1~100 中共有 " + count + " 个偶数");
    }
}
