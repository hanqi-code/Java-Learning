package com.hanqi.javase.chapter09_string.lab;

public class StringTraversalPractice {
    public static void main(String[] args) {
        String game = "Minecraft";
        for (int i = 0; i < game.length(); i++) {
            System.out.print(game.charAt(i)+" ");
        }
    }
}
