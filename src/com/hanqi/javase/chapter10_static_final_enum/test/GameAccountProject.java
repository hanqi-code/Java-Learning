package com.hanqi.javase.chapter10_static_final_enum.test;

public class GameAccountProject {
    public static void main(String[] args) {
        GameAccount steve = new GameAccount("USER001", " Steve", 10, AccountStatus.NORMAL);
        GameAccount alex = new GameAccount("USER002", " Alex ", 20, AccountStatus.NORMAL);
        System.out.println("===== Initial Accounts =====");
        steve.showInfo();
        alex.showInfo();

        GameAccount.setGameName("Block World Online");

        System.out.println("===== Updated Game Name =====");
        alex.setStatus(AccountStatus.BANNED);
        steve.showInfo();
        alex.showInfo();
        System.out.println("MAX_LEVEL=" + GameAccount.getMaxLevel());
    }
}
