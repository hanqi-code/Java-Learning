package com.hanqi.javase.chapter07_method.lab;

public class MethodArrayParameterPractice {
    public static void main(String[] args) {
        int[] scores = {90, 85, 76, 88, 95};
        printScores(scores);
        int sum = getSum(scores);
        System.out.println("总分是：" + sum);
        double average = getAverage(scores);
        System.out.println("平均分是：" + average);
        int max = getMax(scores);
        System.out.println("最高分是：" + max);
    }

    public static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }

    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static double getAverage(int[] scores) {
        int sum = getSum(scores);
        return (double) sum / scores.length;
    }

    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

}
