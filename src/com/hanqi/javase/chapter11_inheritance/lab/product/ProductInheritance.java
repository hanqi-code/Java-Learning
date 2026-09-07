package com.hanqi.javase.chapter11_inheritance.lab.product;

public class ProductInheritance {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("Laptop", 5999, "Lenovo", "Xiaoxin Pro");
        electronicProduct.showInfo();
        System.out.println();
        Clothing clothing = new Clothing("T-Shirt", 99, "L", "Black");
        clothing.showInfo();
    }
}
