package com.hanqi.javase.chapter11_inheritance.lab.express;

public class RemoteAirExpress extends ExpressPackage {
    public RemoteAirExpress() {
    }

    public RemoteAirExpress(String trackingNumber, double weight, String recipient) {
        super(trackingNumber, weight, recipient);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+15;
    }
}
