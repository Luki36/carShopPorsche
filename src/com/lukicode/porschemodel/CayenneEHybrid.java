package com.lukicode.porschemodel;

public class CayenneEHybrid implements Car {
    @Override
    public String getModel() {
        return "Cayenne E-Hybrid";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 410000;
    }
}
