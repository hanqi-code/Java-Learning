package com.hanqi.javase.chapter04_branch.demo;

public class SwitchDemo {
    public static void main(String[] args) {
        int week = 3;

        switch (week) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            default -> System.out.println("输入有误");
        }
    }
}