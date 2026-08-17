package com.hanqi.javase.chapter09_string.lab;

public class StringComparePractice {
    public static void main(String[] args) {
        String game1 = "Minecraft";
        String game2 = new String("Minecraft");
        String game3 = "Stardew Valley";
        System.out.println(game1 == game2);
        System.out.println(game1.equals(game2));

        System.out.println(game1 == game3);
        System.out.println(game1.equals(game3));
    }
}
