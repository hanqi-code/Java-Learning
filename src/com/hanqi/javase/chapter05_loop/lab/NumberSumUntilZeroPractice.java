package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class NumberSumUntilZeroPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = -1;
        while (num != 0) {
            System.out.print("请输入数字：");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("所有数字的总和为：" + sum);
    }
}
