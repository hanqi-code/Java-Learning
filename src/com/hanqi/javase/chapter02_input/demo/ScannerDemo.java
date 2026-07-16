package com.hanqi.javase.chapter02_input.demo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("你的年龄是：" + age + "岁");
    }
}