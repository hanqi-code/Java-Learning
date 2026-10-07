package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：TernaryDemo。
 */
public class TernaryDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 条件 ? 条件成立时的值 : 条件不成立时的值
        int max = a > b ? a : b;
        System.out.println("较大的数：" + max);

        int score = 75;
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("成绩结果：" + result);
        // 练习：把 score 改成 59 和 60，分别运行。
    }
}

