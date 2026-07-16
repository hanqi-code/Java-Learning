package com.hanqi.javase.chapter04_branch.lab;

import java.util.Scanner;

public class ScoreLevelPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的分数：");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("输入的分数有误");
        } else {
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("良好");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }

    }
}
