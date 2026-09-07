package com.hanqi.javase.chapter11_inheritance.lab.product;

public class Clothing extends Product {
    private String size;
    private String color;

    public Clothing() {
    }

    public Clothing(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", size='" + this.size + '\'' +
                ", color='" + this.color + '\'');
    }
}
