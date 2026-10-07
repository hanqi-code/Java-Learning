package com.hanqi.control.demo;

/**
 * break 结束整个循环；continue 跳过本次循环的剩余部分。
 */
public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("break 示例：");
        for (int number = 1; number <= 5; number++) {
            if (number == 4) {
                break;
            }
            System.out.println(number);
        }

        System.out.println("continue 示例：");
        for (int number = 1; number <= 5; number++) {
            if (number == 3) {
                continue;
            }
            System.out.println(number);
        }

        // 练习：把条件中的 4 和 3 换成其他数字，观察输出。
    }
}
