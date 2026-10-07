package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：ArithmeticDemo。
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("加法：" + (a + b));
        System.out.println("减法：" + (a - b));
        System.out.println("乘法：" + (a * b));
        System.out.println("整数除法：" + (a / b));   // 3，舍弃小数部分
        System.out.println("小数除法：" + (a / 3.0)); // 有小数参与
        System.out.println("取余：" + (a % b));      // 1

        System.out.println("结果：" + a + b);       // 从左到右拼接，得到“结果：103”
        System.out.println("结果：" + (a + b));     // 先相加，得到“结果：13”
        System.out.println(2 + 3 * 4);             // 先乘后加，14
        System.out.println((2 + 3) * 4);           // 括号优先，20
        // 练习：修改 a 和 b；除数不能为 0。
    }
}

