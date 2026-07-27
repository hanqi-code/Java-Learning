package com.hanqi.javase.chapter07_method.lab;

public class MethodMenuPractice {
    public static void main(String[] args) {
        System.out.println("学生成绩系统启动");
        printMenu();
        System.out.println("学生成绩系统结束");
    }

    public static void printMenu() {
        System.out.println("===== 学生成绩系统 =====");
        System.out.println("1. 输入成绩");
        System.out.println("2. 输出成绩");
        System.out.println("3. 统计总分");
        System.out.println("4. 退出系统");
    }
}
