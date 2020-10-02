package com.lukicode.porschemodel;

public class TurboCabrio911 implements Car {
    @Override
    public String getModel() {
        return "911 Turbo Cabrio";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 983000;
    }
}
