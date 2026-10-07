package com.hanqi.basic.demo;

import java.util.Scanner;

/**
 * Chapter01 基础练习：InputDemo。
 */
public class InputDemo {
    public static void main(String[] args) {
        // Scanner 用来读取键盘输入，先按固定写法使用。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名（不含空格），输入后按回车：");
        String name = scanner.next();

        System.out.println("请输入年龄（整数），输入后按回车：");
        int age = scanner.nextInt();

        System.out.println("请输入身高（米，例如 1.75），输入后按回车：");
        double height = scanner.nextDouble();

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height + " 米");
        // 本练习请按提示输入，暂不学习错误输入的处理。
        scanner.close();
    }
}

