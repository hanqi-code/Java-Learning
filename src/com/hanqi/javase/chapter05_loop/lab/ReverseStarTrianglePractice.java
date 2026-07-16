package com.hanqi.javase.chapter05_loop.lab;

public class ReverseStarTrianglePractice {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
