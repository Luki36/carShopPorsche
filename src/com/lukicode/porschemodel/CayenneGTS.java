package com.lukicode.porschemodel;

public class CayenneGTS implements Car {
    @Override
    public String getModel() {
        return "Cayenne GTS";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 560000;
    }
}
