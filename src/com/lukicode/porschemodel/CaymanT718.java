package com.lukicode.porschemodel;

public class CaymanT718 implements Car {
    @Override
    public String getModel() {
        return "718 Cayman T";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 288000;
    }
}
