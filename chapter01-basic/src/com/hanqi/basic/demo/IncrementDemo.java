package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：IncrementDemo。
 */
public class IncrementDemo {
    public static void main(String[] args) {
        int count = 5;
        count++;
        System.out.println("自增后：" + count);
        count--;
        System.out.println("自减后：" + count);

        int a = 5;
        int oldValue = a++; // 后置：先使用原值，再加 1
        System.out.println("oldValue：" + oldValue); // 5
        System.out.println("a：" + a);               // 6

        int b = 5;
        int newValue = ++b; // 前置：先加 1，再使用新值
        System.out.println("newValue：" + newValue); // 6
        System.out.println("b：" + b);               // 6
        // -- 的前置、后置规则相同；练习时每行只做一件事。
    }
}

