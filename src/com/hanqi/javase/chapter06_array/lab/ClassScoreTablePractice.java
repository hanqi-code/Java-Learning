package com.hanqi.javase.chapter06_array.lab;

public class ClassScoreTablePractice {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 76, 88},
                {92, 81, 79, 95},
                {70, 80, 86, 91}
        };
        //输出
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        //计算所有学生的总分
        int sum = 0;
        int count = 0;//计算人数
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                count++;
            }
        }
        System.out.println("所有学生的总分是：" + sum);

        //计算所有学生的平均分
        double avg = (double) sum / count;
        System.out.printf("学生的平均分：%.2f\n", avg);

        //最高分
        int max = scores[0][0];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }
        }
        System.out.println("最高分是：" + max);
    }
}
