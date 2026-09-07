package com.hanqi.javase.chapter11_inheritance.lab.dish;

public class ColdDish extends Dish {
    private int shelfLife;

    public ColdDish() {
    }

    public ColdDish(String name, double price, String taste, int shelfLife) {
        super(name, price, taste);
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void introduce() {
        System.out.println(super.getName() + ", 价格 " + super.getPrice() +
                ", 口味 " + super.getTaste() + ", 保质期: " + this.shelfLife + "分钟,"+"适合所有食客");
    }
}
