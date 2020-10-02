package com.lukicode.porschemodel;

public class Carrera911 implements Car {
    @Override
    public String getModel() {
        return "911 Carrera ";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 528000;
    }
}
