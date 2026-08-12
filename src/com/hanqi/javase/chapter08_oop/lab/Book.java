package com.hanqi.javase.chapter08_oop.lab;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public void showInfo() {
        System.out.println("书名：" + title);
        System.out.println("作者：" + author);
        System.out.println("价格：" + price);
    }
}
