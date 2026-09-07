package com.hanqi.javase.chapter11_inheritance.lab.express;

public class SameCityExpress extends ExpressPackage {
    public SameCityExpress() {
    }

    public SameCityExpress(String trackingNumber, double weight, String recipient) {
        super(trackingNumber, weight, recipient);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+10;
    }
}
