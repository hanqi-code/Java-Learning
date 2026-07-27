package com.hanqi.javase.chapter07_method.lab;

import java.util.Scanner;

public class StudentScoreMethodBigLab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] scores = {90, 85, 76, 88, 95};

        printScores(scores);

        int sum = getSum(scores);
        System.out.println("总分:" + sum);

        double average = getAverage(scores);
        System.out.println("平均分:" + average);

        int max = getMax(scores);
        System.out.println("最高分:" + max);

        int min = getMin(scores);
        System.out.println("最低分:" + min);

        int count = countAboveAverage(average, scores);
        System.out.println("高于平均分的人数是：" + count);

        System.out.print("请输入要查找的分数：");
        int target = sc.nextInt();
        boolean flag = containsScore(target, scores);
        if (flag) {
            System.out.println("找到了该成绩：" + target);
        } else {
            System.out.println("没有找到该成绩：" + target);
        }

        bubbleSort(scores);
        System.out.print("排序后的成绩：");
        printScores(scores);
    }

    //输出所有成绩
    public static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }

    //输出总分
    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    //输出平均分
    public static double getAverage(int[] scores) {
        int sum = getSum(scores);
        return (double) sum / scores.length;
    }

    // 求最高分
    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }


    // 求最低分
    public static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    //统计高于平均分的人数
    public static int countAboveAverage(double average, int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                count++;
            }
        }
        return count;
    }


    //查找某个成绩是否存在
    public static boolean containsScore(int target, int[] scores) {
        boolean flag = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //成绩从低到高排序
    public static void bubbleSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
    }
}
