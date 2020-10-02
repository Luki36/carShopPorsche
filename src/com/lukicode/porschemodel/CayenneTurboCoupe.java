package com.lukicode.porschemodel;

public class CayenneTurboCoupe implements Car {
    @Override
    public String getModel() {
        return "Cayenne Turbo Coupe";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 731000;
    }
}
