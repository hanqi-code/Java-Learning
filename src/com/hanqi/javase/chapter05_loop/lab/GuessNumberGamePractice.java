package com.hanqi.javase.chapter05_loop.lab;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGamePractice {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int target = r.nextInt(1, 101);
        int countTime = 10;//猜的次数
        while (countTime > 0) {
            System.out.print("请输入猜测的数字：");
            int guessNumber = s.nextInt();
            if (guessNumber == target) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNumber > target) {
                System.out.println("你猜的数字太大了！");
            } else {
                System.out.println("你猜的数字太小了！");
            }
            countTime--;
            System.out.println("还剩" + countTime + "次机会");
        }
        System.out.println("游戏结束");
    }
}
