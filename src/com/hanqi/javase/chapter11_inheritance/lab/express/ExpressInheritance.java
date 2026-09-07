package com.hanqi.javase.chapter11_inheritance.lab.express;

public class ExpressInheritance {
    public static void main(String[] args) {
        RemoteAirExpress remoteAirExpress = new RemoteAirExpress("SC001", 3, "Tom");
        System.out.println(remoteAirExpress.calculateCost());
        SameCityExpress sameCityExpress = new SameCityExpress("SC002", 5, "Jerry");
        System.out.println(sameCityExpress.calculateCost());
    }
}
