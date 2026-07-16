package com.hanqi.javase.chapter05_loop.lab;

public class SavingsGoalPractice {
    public static void main(String[] args) {
        int money = 100;
        int month = 1;
        while (money < 1000) {
            money += 200;
            System.out.println("第" + month + "个月，余额为：" + money);
            month++;
        }
        System.out.println("在第" + (month - 1) + "个月，余额为：" + money + "元");
    }
}
