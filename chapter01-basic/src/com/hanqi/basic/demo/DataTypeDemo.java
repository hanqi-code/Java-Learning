package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：DataTypeDemo。
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        // Java 的八种基本数据类型
        byte smallNumber = 100;      // -128 到 127
        short studentCount = 1000;
        int population = 100000;
        long bigNumber = 3000000000L; // long 字面量加 L
        float height = 1.75F;         // float 字面量加 F
        double price = 19.99;
        char grade = 'A';
        boolean passed = true;

        System.out.println("byte：" + smallNumber);
        System.out.println("short：" + studentCount);
        System.out.println("int：" + population);
        System.out.println("long：" + bigNumber);
        System.out.println("float：" + height);
        System.out.println("double：" + price);
        System.out.println("char：" + grade);
        System.out.println("boolean：" + passed);
        // String 不属于八种基本数据类型，这里只学习用它保存文字。
        String message = "继续加油";
        System.out.println(message);
    }
}

