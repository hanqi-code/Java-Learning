package com.hanqi.control.demo;

/**
 * switch 的箭头写法：匹配后只执行对应分支，不需要 break。
 */
public class SwitchArrowDemo {
    public static void main(String[] args) {
        int day = 6;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("周末");
            default -> System.out.println("请输入 1 到 7");
        }

        // 一个 case 可以写多个值，用逗号分开。
        // 箭头写法不会继续执行下一个 case。
        // 练习：把 day 改成 1、7 和 8，再运行看看。
    }
}
