package com.hanqi.javase.chapter06_array.demo;

public class ArrayMinDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 76, 88, 95};
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        System.out.println("最低分是：" + min);
    }
}
