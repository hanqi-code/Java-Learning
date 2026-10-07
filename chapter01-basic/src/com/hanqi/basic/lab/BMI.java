package com.hanqi.basic.lab;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.next();

        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.print("请输入你的性别：");
        String gender = scanner.next();

        System.out.print("请输入你的身高(米)：");
        double height = scanner.nextDouble();

        System.out.print("请输入你的体重(千克)：");
        double weight = scanner.nextDouble();

        // 计算BMI值
        double bmi = calculateBMI(weight, height);

        // 显示信息
        showInfo(name, age, gender, height, weight, bmi);
    }

    // 计算BMI值
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    // 显示信息
    public static void showInfo(String name, int age, String gender, double height, double weight, double bmi) {
        System.out.println("姓名：" + name + "\n" +
                "年龄：" + age + "\n" +
                "性别：" + gender + "\n" +
                "身高：" + height + "\n" +
                "体重：" + weight + "\n" +
                "BMI：" + bmi);
    }
}
