package com.hanqi.control.demo;

/**
 * while 循环：先判断条件，成立才执行循环体。
 */
public class WhileLoopDemo {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 5) {
            System.out.println("当前数字：" + number);
            number++; // 改变条件中的变量，避免一直循环
        }

        System.out.println("循环结束，此时 number = " + number);
        // 练习：把 number 的初始值改成 6，会打印几次“当前数字”？
    }
}
