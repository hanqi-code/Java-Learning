package com.hanqi.control.demo;

/**
 * switch 根据一个值选择要执行的分支。
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("这里暂时只演示星期一到星期三");
                break;
        }

        // break 让程序结束当前 switch，避免继续执行后面的 case。
        // 练习：把 day 改成 1、2 和 4，再运行看看。
    }
}
