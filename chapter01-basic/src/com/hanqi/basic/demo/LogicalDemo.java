package com.hanqi.basic.demo;

/**
 * Chapter01 基础练习：LogicalDemo。
 */
public class LogicalDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = true;
        System.out.println("并且：" + (age >= 18 && hasTicket));
        System.out.println("或者：" + (age >= 18 || hasTicket));
        System.out.println("取反：" + !hasTicket);
        // && 两边都为 true 才是 true；|| 至少一边为 true 就是 true。

        int count = 0;
        boolean first = false && (++count > 0); // 左边为 false，右边不执行
        System.out.println("短路与的结果：" + first);
        System.out.println("count：" + count);   // 0
        boolean second = true || (++count > 0); // 左边为 true，右边不执行
        System.out.println("短路或的结果：" + second);
        System.out.println("count：" + count);   // 仍为 0

        System.out.println(true & false); // 布尔值的 &、| 不短路
        System.out.println(true | false);
        System.out.println(true ^ true);  // 布尔异或：不同为 true，相同为 false
    }
}

