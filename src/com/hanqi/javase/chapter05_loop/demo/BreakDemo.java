package com.hanqi.javase.chapter05_loop.demo;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("正在检查数字"+ i);
            if (i == 5) {
                System.out.println("找到目标数字："+i);
                break;
            }
        }
        System.out.println("程序结束");
    }
}
