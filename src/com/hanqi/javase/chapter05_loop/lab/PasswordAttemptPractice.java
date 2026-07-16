package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class PasswordAttemptPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入密码：");
            input = sc.nextInt();
            if (input == 12345) {
                System.out.println("密码正确！");
                break;
            }else{
                System.out.println("密码错误！请重新输入");
            }
        }
    }
}
