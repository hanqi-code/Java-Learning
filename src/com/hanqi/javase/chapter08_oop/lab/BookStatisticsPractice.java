package com.hanqi.javase.chapter08_oop.lab;

public class BookStatisticsPractice {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("The Little Prince", "Antoine de Saint-Exupery", 39.9);
        books[1] = new Book("Pride and Prejudice", "Jane Austen", 49.9);
        books[2] = new Book("The Old Man and the Sea", "Ernest Hemingway", 45.0);
        books[3] = new Book("1984", "George Orwell", 59.9);

        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        System.out.printf("总价：%.2f%n",sum);

        double average = sum / books.length;
        System.out.printf("平均价格：%.2f%n",average);

        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() > average){
                count++;
            }
        }
        System.out.println("高于平均价格的书有：" + count + "本");

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
