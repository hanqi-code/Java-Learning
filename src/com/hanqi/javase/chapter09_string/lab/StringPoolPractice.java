package com.hanqi.javase.chapter09_string.lab;



public class StringPoolPractice {
    public static void main(String[] args) {
        String game1 = "Minecraft";
        String game2 = "Minecraft";
        String game3 = new String("Minecraft");
        System.out.println(game1 == game2);
        System.out.println(game1 == game3);
        System.out.println();
        System.out.println(game1.equals(game2));
        System.out.println(game1.equals(game3));
    }
}
