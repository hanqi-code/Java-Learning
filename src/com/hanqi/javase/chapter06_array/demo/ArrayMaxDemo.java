package com.hanqi.javase.chapter06_array.demo;

public class ArrayMaxDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 76, 88, 95};
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("最高分是：" + max);
    }
}
