package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class SecurityPatrolChapterLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入楼层：");
        int floor = sc.nextInt();
        System.out.print("请输入房间数：");
        int room = sc.nextInt();
        System.out.print("暂停检查的房间号:");
        int repairRoom = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= floor; i++) {
            for (int j = 1; j <= room; j++) {
                if (j == repairRoom) {
                    System.out.println("第" + i + "层，第" + j + "正在维修，跳过");
                    continue;
                }
                System.out.println("第" + i + "层，第" + j + "室");
            }
            System.out.println();
        }
    }
}
