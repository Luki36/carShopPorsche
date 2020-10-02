package com.lukicode.porschemodel;

public class CarreraS_911 implements Car {
    @Override
    public String getModel() {
        return "911 Carrera S";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 603000;
    }
}
