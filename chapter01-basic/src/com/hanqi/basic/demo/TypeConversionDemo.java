package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：TypeConversionDemo。
 */
public class TypeConversionDemo {
    public static void main(String[] args) {
        int count = 10;
        double number = count;       // 自动类型转换：int 转 double
        System.out.println("自动转换：" + number);

        double price = 9.8;
        int wholePrice = (int) price; // 强制转换：直接舍弃小数部分，不是四舍五入
        System.out.println("强制转换：" + wholePrice);

        byte a = 10;
        byte b = 20;
        int sum = a + b;             // byte 参与这种算术运算时会提升为 int
        System.out.println("相加：" + sum);
        // 练习：把 price 改为 9.2，比较结果。
    }
}

