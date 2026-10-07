package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：ComparisonDemo。
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b); // == 比较是否相等，= 是赋值
        System.out.println(a != b);
        // 比较运算的结果是 boolean：true 或 false。
        // 练习：让 a 和 b 相等，再观察六个结果。
    }
}

