package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class MultiplicationTablePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int number = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + "*" + i + "=" + i * number);
        }
    }
}
