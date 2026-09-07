package com.hanqi.javase.chapter11_inheritance.lab.dish;

public class Dish {
    private String name;
    private double price;
    private String taste;

    public Dish() {
    }

    public Dish(String name, double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void introduce(){
        System.out.println("Dish name: " + this.name + ", price: " + this.price + ", taste: " + this.taste);
    }
}
