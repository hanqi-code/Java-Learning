package com.hanqi.javase.chapter11_inheritance.lab.express;

public class ExpressPackage {
    private String trackingNumber;
    private double weight;
    private String recipient;

    public ExpressPackage() {
    }

    public ExpressPackage(String trackingNumber, double weight, String recipient) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.recipient = recipient;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double calculateCost() {
        return this.weight * 10.0;
    }
}
