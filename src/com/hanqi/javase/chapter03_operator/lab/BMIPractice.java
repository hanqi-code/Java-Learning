package com.hanqi.javase.chapter03_operator.lab;

import java.util.Scanner;

public class BMIPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的体重：");
        double weight = sc.nextDouble();
        System.out.print("请输入你的身高：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI是：" + bmi);
    }
}
