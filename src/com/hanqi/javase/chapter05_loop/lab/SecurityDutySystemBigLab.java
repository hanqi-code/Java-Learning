package com.hanqi.javase.chapter05_loop.lab;

import java.util.Scanner;

public class SecurityDutySystemBigLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("1. 开始巡楼");
            System.out.println("2. 查看值班信息");
            System.out.println("3. 退出系统");
            System.out.print("请输入：");
            input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.print("输入楼层数：");
                    int floor = sc.nextInt();
                    System.out.print("输入每层房间数：");
                    int room = sc.nextInt();
                    System.out.print("输入维修房间号：");
                    int repairRoom = sc.nextInt();
                    for (int i = 1; i <= floor; i++) {
                        for (int j = 1; j <= room; j++) {
                            if (j == repairRoom) {
                                System.out.println("第" + i + "层，第" + j + "室正在维修，跳过");
                                continue;
                            }
                            System.out.println("第" + i + "层，第" + j + "室");
                        }
                        System.out.println();
                    }
                }
                case 2 -> System.out.println("输出：当前值班人员正在执行夜间巡查任务");
                case 3 -> System.out.println("退出系统");
                default -> System.out.println("输入错误，请重新输入");
            }
        } while (input != 3);
    }
}
