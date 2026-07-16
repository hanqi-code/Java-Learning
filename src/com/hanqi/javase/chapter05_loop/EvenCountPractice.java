package com.hanqi.javase.chapter05_loop;

public class EvenCountPractice {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("统计1~100 中有"+count+"偶数");
    }
}
