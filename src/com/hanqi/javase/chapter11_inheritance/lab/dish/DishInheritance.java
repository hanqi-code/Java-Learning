package com.hanqi.javase.chapter11_inheritance.lab.dish;

public class DishInheritance {
    public static void main(String[] args) {
        HotDish hotDish = new HotDish("热菜水煮鱼", 88, "麻辣", 20);
        hotDish.introduce();
        ColdDish coldDish = new ColdDish("凉菜拍黄瓜", 15.0, "酸辣", 30);
        coldDish.introduce();
    }
}
