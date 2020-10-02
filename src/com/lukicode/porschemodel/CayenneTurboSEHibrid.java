package com.lukicode.porschemodel;

public class CayenneTurboSEHibrid implements Car{
    @Override
    public String getModel() {
        return "Cayenne Turbo S E-Hibrid";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 843000;
    }
}
