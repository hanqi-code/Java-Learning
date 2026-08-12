package com.hanqi.javase.chapter08_oop.demo;

import com.hanqi.javase.chapter08_oop.lab.Book;

public class BookStatisticsDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("The Little Prince", "Antoine de Saint-Exupery", 39.9);
        books[1] = new Book("Pride and Prejudice", "Jane Austen", 49.9);
        books[2] = new Book("The Old Man and the Sea", "Ernest Hemingway", 45.0);

        double sum = 0;

        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }

        double average = sum / books.length;

        System.out.println("总价：" + sum);
        System.out.printf("平均价格：%.2f%n",average);

        Book maxBook = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > maxBook.getPrice()) {
                maxBook = books[i];
            }
        }

        System.out.println("最贵的书：");
        maxBook.showInfo();
    }
}