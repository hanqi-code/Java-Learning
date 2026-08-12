package com.hanqi.javase.chapter08_oop.lab;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        setPrice(price);
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("价格不合法");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        System.out.println("手机品牌：" + brand);
        System.out.println("手机价格：" + price);
        System.out.println("手机颜色：" + color);
    }

    public boolean isExpensive() {
        return price >= 5000;
    }
}
