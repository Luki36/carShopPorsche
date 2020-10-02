package com.lukicode.porschemodel;

public class Turbo911 implements Car {
    @Override
    public String getModel() {
        return "911 Turbo";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 918000;
    }
}
