package com.hanqi.control.demo;

/**
 * if、if-else 和 if-else if-else 分支。
 */
public class IfDemo {
    public static void main(String[] args) {
        int temperature = 30;
        if (temperature >= 28) {
            System.out.println("天气热，记得喝水。");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }

        int score = 85;
        if (score >= 90) {
            System.out.println("成绩：优秀");
        } else if (score >= 60) {
            System.out.println("成绩：及格");
        } else {
            System.out.println("成绩：需要继续努力");
        }

        // 练习：把 score 改成 59、60 和 90，观察走进哪个分支。
    }
}
