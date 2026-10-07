package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：VariableDemo。
 */
public class VariableDemo {
    public static void main(String[] args) {
        int age = 18;                 // 类型 变量名 = 初始值;
        System.out.println("原来的年龄：" + age);
        age = 19;                     // 重新赋值，不要重复写类型
        System.out.println("现在的年龄：" + age);

        double price = 9.9;
        String name = "小韩";          // String 表示字符串
        final int DAYS_PER_WEEK = 7;   // final 修饰的变量赋值后不能再次赋值
        System.out.println("姓名：" + name);
        System.out.println("价格：" + price);
        System.out.println("一周天数：" + DAYS_PER_WEEK);
        // 练习：修改变量的值，观察输出。
    }
}

