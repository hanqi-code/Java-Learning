package com.hanqi.javase.chapter07_method.demo;

public class ArrayParameterDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 76, 88, 95};

        printScores(scores);

        int sum = getSum(scores);
        System.out.println("总分是：" + sum);
    }

    public static void printScores(int[] scores) {
        System.out.print("所有成绩：");

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
}