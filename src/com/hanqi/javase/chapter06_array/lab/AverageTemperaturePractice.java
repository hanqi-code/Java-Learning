package com.hanqi.javase.chapter06_array.lab;

public class AverageTemperaturePractice {
    public static void main(String[] args) {
        double[] temperatures = {22.5, 23.0, 21.8, 24.2, 25.0, 23.6, 22.9};
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        double average = sum / temperatures.length;
        int day=0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average){
                day++;
            }
        }
        System.out.printf("一周平均温度是：%.2f℃\n",average);
        System.out.println("高于平均温度的天数有："+day+"天");
    }
}
