package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class BuildingInspectionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入楼层数：");
        int floor = sc.nextInt();
        System.out.print("请输入每层房间数：");
        int room = sc.nextInt();
        for (int i = 1; i <= floor; i++) {
            for (int j = 1; j <= room; j++) {
                System.out.println("第"+i+"层，第"+j+"室");
            }
            System.out.println();
        }
    }
}
