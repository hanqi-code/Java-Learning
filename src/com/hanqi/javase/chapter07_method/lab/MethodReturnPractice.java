package com.hanqi.javase.chapter07_method.lab;

public class MethodReturnPractice {
    public static void main(String[] args) {
        int result = getSum(10, 20);
        double avg = getAverage(80, 90);
        boolean isPass = isPass(70);
        System.out.println("结果是：" + result);
        System.out.println("平均值是：" + avg);
        System.out.println("是否及格：" + isPass);

    }
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static boolean isPass(int score) {
        return score >= 60;
    }
}
