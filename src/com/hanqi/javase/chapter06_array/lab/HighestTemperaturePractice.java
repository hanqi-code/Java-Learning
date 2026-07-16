package com.hanqi.javase.chapter06_array.lab;

public class HighestTemperaturePractice {
    public static void main(String[] args) {
        double[] temperatures = {22.5, 23.0, 21.8, 24.2, 25.0, 23.6, 22.9};
        double max = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (max < temperatures[i]) {
                max = temperatures[i];
            }
        }
        System.out.println("最高温度是：" + max);
    }
}
