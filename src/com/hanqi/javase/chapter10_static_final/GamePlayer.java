package com.hanqi.javase.chapter10_static_final;

public class GamePlayer {
    private String name;
    static String serverName;

    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getServerName() {
        return serverName;
    }

    public static void setServerName(String serverName) {
        GamePlayer.serverName = serverName;
    }

    public void showInfo() {
        System.out.println("姓名：" + name + "服务器：" + serverName);
    }
}
