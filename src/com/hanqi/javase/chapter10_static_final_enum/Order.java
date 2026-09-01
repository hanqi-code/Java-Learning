package com.hanqi.javase.chapter10_static_final_enum;

public class Order {
    private final String orderId;
    private String productName;
    private double price;
    private String status= "待支付";
    private static String platform = "Hanqi Mall";

    public Order(String orderId, String productName, double price) {
        this.orderId = orderId;
        this.productName = productName;
        setPrice(price);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("价格不合法");
        } else {
            this.price = price;
        }

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String getPlatform() {
        return platform;
    }

    public static void setPlatform(String platform) {
        Order.platform = platform;
    }

    public void showInfo() {
        System.out.println(
                getOrderId() + " / " +
                        getProductName() + " / " +
                        getPrice() + " / " +
                        getStatus() + " / " +
                        getPlatform()
        );
    }
}
