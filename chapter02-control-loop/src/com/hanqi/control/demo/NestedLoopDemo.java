package com.hanqi.control.demo;

/**
 * 循环嵌套：外层每执行一次，内层就完整执行一轮。
 */
public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print("* ");
            }
            System.out.println(); // 换到下一行
        }

        // 练习：修改行数和列数，观察星号图案怎么变化。
    }
}
