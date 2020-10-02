package com.lukicode.porschemodel;

public class CayenneCoupe implements Car {
    @Override
    public String getModel() {
        return "Cayenne Coupe";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 411000;
    }
}
