package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class NumberStatisticsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if(i%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("1~" + n + "的数字和为：" + sum);
        System.out.println("1~" + n + "的数字中偶数的个数为：" + evenCount);
        System.out.println("1~" + n + "的数字中奇数的个数为：" + oddCount);
    }
}
