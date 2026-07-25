package com.hanqi.javase.chapter06_array.lab;

import java.util.Scanner;

public class StudentScoreStatisticsBigLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = sc.nextInt();
        int[] scores = new int[num];

        //输入每个学生成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextInt();
        }

        //输出所有成绩
        System.out.print("所有学生成绩：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //统计总分
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总分是：" + sum);

        //统计平均分
        double avg = (double) sum / scores.length;
        System.out.printf("平均分是：%.2f\n", avg);

        //统计最高分和最低分
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("最高分是：" + max + " " + "最低分是：" + min);

        //统计高于平均分的人数
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > avg) {
                count++;
            }
        }
        System.out.println("高于平均分的人数是：" + count);

        //查找某个成绩是否存在
        System.out.print("请输入要查找的分数：");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("找到了该成绩：" + target);
        } else {
            System.out.println("没有找到该成绩：" + target);
        }

        //成绩从低到高排序
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        System.out.print("排序后的成绩是：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}
