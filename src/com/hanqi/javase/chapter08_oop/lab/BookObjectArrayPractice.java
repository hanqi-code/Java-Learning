package com.hanqi.javase.chapter08_oop.lab;

public class BookObjectArrayPractice {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("The Little Prince", "Antoine de Saint-Exupery", 39.9);
        books[1] = new Book("Pride and Prejudice", "Jane Austen", 49.9);
        books[2] = new Book("The Old Man and the Sea", "Ernest Hemingway", 45.0);
        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
            System.out.println();
        }
    }
}
