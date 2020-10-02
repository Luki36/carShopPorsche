package com.lukicode.porschemodel;

public class CayenneEHibrdCoupe implements Car {
    @Override
    public String getModel() {
        return "Cayenne Coupe E-Hibrid";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 439000;
    }
}
