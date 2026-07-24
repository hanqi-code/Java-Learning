package com.hanqi.javase.chapter06_array.lab;

import java.util.Scanner;

public class StudentScoreInputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[5];

        //输入 5 个学生成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }

        //输出 5 个学生成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个学生的成绩是：" + scores[i]);
        }

        //计算总分
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总分是：" + sum);

        //计算平均分
        double avg = sum / scores.length;
        System.out.printf("平均分是：%.2f\n", avg);

        //最高分 最低分
        double max = scores[0];
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("最高分是：" + max + " " + "最低分是：" + min);
    }
}
