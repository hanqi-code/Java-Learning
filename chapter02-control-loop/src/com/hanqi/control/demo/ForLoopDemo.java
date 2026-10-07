package com.hanqi.control.demo;

/**
 * for 循环：知道重复次数时很方便。
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 5; number++) {
            System.out.println("当前数字：" + number);
            sum += number;
        }

        System.out.println("1 到 5 的和：" + sum);
        // 练习：把 5 改成 10，计算 1 到 10 的和。
    }
}
