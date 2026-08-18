package com.hanqi.javase.chapter10_static_final;

public class StaticVariablePractice {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer("Steve");
        GamePlayer player2 = new GamePlayer("Alex");

        GamePlayer.serverName = "Asia-1";
        player1.showInfo();
        player2.showInfo();

        System.out.println("==========");

        GamePlayer.serverName = "Asia-2";
        player1.showInfo();
        player2.showInfo();

    }
}
