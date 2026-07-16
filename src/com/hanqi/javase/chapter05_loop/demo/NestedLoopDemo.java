package com.hanqi.javase.chapter05_loop.demo;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int floor = 1; floor <= 3; floor++) {
            for (int room = 1; room <= 5; room++) {
                System.out.println("第"+floor+"层，第"+room+"室");
            }
            System.out.println();
        }
    }
}
