package com.lukicode.porschemodel;

public class CaymanS718 implements Car {
    @Override
    public String getModel() {
        return "718 Cayman S";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 339000;
    }
}
