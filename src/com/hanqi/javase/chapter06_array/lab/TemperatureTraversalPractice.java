package com.hanqi.javase.chapter06_array.lab;

public class TemperatureTraversalPractice {
    public static void main(String[] args) {
        double[] temperatures = {22.5, 23.0, 21.8, 24.2, 25.0, 23.6, 22.9};
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("第"+(i+1)+"天温度："+temperatures[i]+"℃");
        }
    }
}
