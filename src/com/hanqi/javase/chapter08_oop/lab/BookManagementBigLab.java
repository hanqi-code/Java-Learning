package com.hanqi.javase.chapter08_oop.lab;

public class BookManagementBigLab {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("The Little Prince", "Antoine de Saint-Exupery", 39.9);
        books[1] = new Book("Pride and Prejudice", "Jane Austen", 49.9);
        books[2] = new Book("The Old Man and the Sea", "Ernest Hemingway", 45.0);
        books[3] = new Book("1984", "George Orwell", 59.9);
        books[4] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 55.0);

        //1. 输出所有图书
        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
            System.out.println();
        }

        //2. 计算所有图书总价
        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        System.out.printf("总价：%.2f%n",sum);

        //3. 计算平均价格
        double average = sum / books.length;
        System.out.printf("平均价格：%.2f%n",average);
        System.out.println();

        //4. 找出最贵的 Book 对象
        Book maxBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (maxBook.getPrice()< books[i].getPrice()) {
                maxBook = books[i];
            }
        }
        System.out.println("最贵的书：");
        maxBook.showInfo();
        System.out.println();

        //5.找出最便宜的 Book 对象
        Book minBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (minBook.getPrice()> books[i].getPrice()) {
                minBook = books[i];
            }
        }
        System.out.println("最便宜的书：");
        minBook.showInfo();
        System.out.println();

        //6. 统计价格高于平均价格的书有几本
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() > average) {
                count++;
            }
        }
        System.out.println("价格高于平均价格的书有" + count + "本");
        System.out.println();

        //7. 根据书名查找图书
        String target="1984";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(target)) {
                books[i].showInfo();
                break;
            }
        }
        System.out.println();


        //8. 修改某本书的价格
        String target2="The Great Gatsby";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(target2)) {
                books[i].setPrice(59.9);
                books[i].showInfo();
                break;
            }
        }
        System.out.println();

        //9. 再次输出修改后的图书信息
        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
            System.out.println();
        }



    }
}
