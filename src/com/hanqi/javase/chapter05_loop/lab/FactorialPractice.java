package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class FactorialPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "的阶乘为：" + factorial);
    }
}
