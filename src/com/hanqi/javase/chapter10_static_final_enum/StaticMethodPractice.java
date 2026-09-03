package com.hanqi.javase.chapter10_static_final_enum;

public class StaticMethodPractice {
    public static void main(String[] args) {
        System.out.println(GamePlayer.getServerName());
        GamePlayer.setServerName("Asia-3");
        System.out.println(GamePlayer.getServerName());

    }
}
