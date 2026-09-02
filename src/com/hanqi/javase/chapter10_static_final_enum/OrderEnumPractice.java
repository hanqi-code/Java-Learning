package com.hanqi.javase.chapter10_static_final_enum;

public class OrderEnumPractice {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PENDING;
        System.out.println(status.getStatus());

        status = OrderStatus.PAID;
        if (status == OrderStatus.PAID) {
            System.out.println("订单已支付");
        }

        switch(status){
            case PENDING -> System.out.println("订单待支付");
            case PAID -> System.out.println("订单已支付");
            case SHIPPED -> System.out.println("订单已发货");
            case COMPLETED -> System.out.println("订单已完成");
            case CANCELLED -> System.out.println("订单已取消");
        }
    }
}
