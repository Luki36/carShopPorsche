package com.lukicode.porschemodel;

public class CayenneTurboSEHibidCoupe implements Car {
    @Override
    public String getModel() {
        return "Cayenne Turbo S E-Hybrid Coupe";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 864000;
    }
}
