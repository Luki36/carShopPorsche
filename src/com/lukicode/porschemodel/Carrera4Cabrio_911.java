package com.lukicode.porschemodel;

public class Carrera4Cabrio_911 implements Car {
    @Override
    public String getModel() {
        return "911 Carrera 4 Cabrio";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 635000;
    }
}
