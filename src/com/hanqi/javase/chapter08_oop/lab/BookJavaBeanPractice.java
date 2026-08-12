package com.hanqi.javase.chapter08_oop.lab;

public class BookJavaBeanPractice {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("The Little Prince");
        b1.setAuthor("Antoine de Saint-Exupery");
        b1.setPrice(39.9);
        b1.showInfo();
        System.out.println("==========");
        Book b2 = new Book("Pride and Prejudice", "Jane Austen", 49.9);
        b2.showInfo();
        System.out.println("==========");
        b2.setPrice(-50);
        b2.showInfo();
    }
}
