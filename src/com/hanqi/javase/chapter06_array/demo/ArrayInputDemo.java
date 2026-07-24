package com.hanqi.javase.chapter06_array.demo;

import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个成绩：");
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个成绩是：" + scores[i]);
        }
    }
}
