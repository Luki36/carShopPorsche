package com.lukicode.porschemodel;

public class CarreraCabrio911 implements Car {
    @Override
    public String getModel() {
        return "911 Carrera Cabrio";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 597000;
    }
}
