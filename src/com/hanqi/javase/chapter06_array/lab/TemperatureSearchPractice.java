package com.hanqi.javase.chapter06_array.lab;

import java.util.Scanner;

public class TemperatureSearchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的温度：");
        double target = sc.nextDouble();
        boolean flag = false;
        double[] temperatures = {22.5, 23.0, 21.8, 24.2, 25.0, 23.6, 22.9};
        for (int i = 0; i < temperatures.length; i++) {
            if (target == temperatures[i]){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("找到了该温度："+ target);
        } else {
            System.out.println("没有找到该温度");
        }
    }
}
