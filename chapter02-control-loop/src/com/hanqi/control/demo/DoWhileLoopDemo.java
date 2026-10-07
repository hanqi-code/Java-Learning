package com.hanqi.control.demo;

/**
 * do-while 循环：先执行一次，再判断条件。
 */
public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int number = 1;

        do {
            System.out.println("当前数字：" + number);
            number++;
        } while (number <= 3);

        // 即使条件一开始就是 false，do-while 也会执行一次。
        int anotherNumber = 5;
        do {
            System.out.println("只执行一次：" + anotherNumber);
            anotherNumber++;
        } while (anotherNumber < 3);
    }
}
