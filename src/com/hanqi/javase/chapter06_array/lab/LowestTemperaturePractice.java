package com.hanqi.javase.chapter06_array.lab;

public class LowestTemperaturePractice {
    public static void main(String[] args) {
        double[] temperatures = {22.5, 23.0, 21.8, 24.2, 25.0, 23.6, 22.9};
        double min = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (min > temperatures[i]) {
                min = temperatures[i];
            }
        }
        System.out.println("最低温度是：" + min);
    }
}
