package com.hanqi.javase.chapter10_static_final_enum.test;

public class GameAccount {
    private final String accountId;
    private String nickname;
    private int level;
    private static String gameName = "Block World";
    private static final int MAX_LEVEL = 100;
    private AccountStatus status;



    public GameAccount(String accountId, String nickname, int level, AccountStatus status) {
        this.accountId = accountId;
        this.nickname = nickname;
        setLevel(level);
        this.status = status;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0 && level <= MAX_LEVEL) {
            this.level = level;
        } else {
            System.out.println("Level must be between 0 and " + MAX_LEVEL);
        }
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public static String getGameName() {
        return gameName;
    }

    public static void setGameName(String gameName) {
        GameAccount.gameName = gameName;
    }

    public static int getMaxLevel() {
        return MAX_LEVEL;
    }

    public void showInfo() {
        System.out.println(getAccountId() + "/" + getNickname() +
                "/" + getLevel() + "/" + status + "/" + getGameName());
    }
}
