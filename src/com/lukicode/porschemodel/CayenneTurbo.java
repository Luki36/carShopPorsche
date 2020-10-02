package com.lukicode.porschemodel;

public class CayenneTurbo implements Car {
    @Override
    public String getModel() {
        return "Cayenne Turbo";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 701000;
    }
}
