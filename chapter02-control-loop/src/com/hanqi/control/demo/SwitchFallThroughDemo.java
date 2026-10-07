package com.hanqi.control.demo;

/**
 * 传统 switch 不写 break 时，会从匹配的 case 继续往下执行。
 */
public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("执行 case 1");
            case 2:
                System.out.println("执行 case 2");
            case 3:
                System.out.println("执行 case 3");
            default:
                System.out.println("执行 default");
        }

        // number 是 2，但会依次输出 case 2、case 3 和 default。
        // 练习：把 number 改成 1、3 和 4，观察每次从哪里开始执行。
    }
}
