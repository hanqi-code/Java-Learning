package com.hanqi.javase.chapter11_inheritance.lab.dish;

public class HotDish extends Dish {
    private int cookingTime;

    public HotDish() {
    }

    public HotDish(String name, double price, String taste, int cookingTime) {
        super(name, price, taste);
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Override
    public void introduce() {
        System.out.println(super.getName() + ", 价格 " + super.getPrice() +
                ", 口味 " + super.getTaste() + ", 烹饪时间: " + this.cookingTime + "分钟"+","+"适合重口味食客");
    }
}
