package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class MenuChoicePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.开始学习 Java");
            System.out.println("2.查看学习进度");
            System.out.println("3.退出程序");
            System.out.print("请选择：");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("开始学习 Java");
                case 2 -> System.out.println("查看学习进度");
                case 3 -> System.out.println("退出程序");
                default -> System.out.println("请输入数字1~3");
            }
            System.out.println();
        } while (choice != 3);
        System.out.println("程序结束");
    }
}
