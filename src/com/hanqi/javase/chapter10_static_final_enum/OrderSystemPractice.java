package com.hanqi.javase.chapter10_static_final_enum;

public class OrderSystemPractice {
    public static void main(String[] args) {
        Order order1 = new Order("ORDER001","Minecraft",99);
        Order order2 = new Order("ORDER002","Stardew Valley",48);
        order1.setStatus("已支付");
        Order.setPlatform("Hanqi Game Store");
        order1.showInfo();
        order2.showInfo();
    }
}
