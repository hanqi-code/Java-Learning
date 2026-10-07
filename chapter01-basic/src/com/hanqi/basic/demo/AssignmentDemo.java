package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：AssignmentDemo。
 */
public class AssignmentDemo {
    public static void main(String[] args) {
        int score = 10;
        score += 5;
        System.out.println("加 5 后：" + score);
        score -= 3;
        System.out.println("减 3 后：" + score);
        score *= 2;
        System.out.println("乘 2 后：" + score);
        score /= 4;
        System.out.println("除以 4 后：" + score);
        score %= 4;
        System.out.println("对 4 取余后：" + score);
        // 练习：先在纸上算每一步，再运行核对。
    }
}

