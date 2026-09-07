package com.hanqi.javase.chapter11_inheritance.lab.product;

public class ElectronicProduct extends Product {
    private String brand;
    private String model;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void showInfo() {
        System.out.println("name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'');
    }
}
