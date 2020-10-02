package com.lukicode.porschemodel;

public class BoxsterS718 implements Car{
    @Override
    public String getModel() {
        return "718 Boxster S";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 342000;
    }
}
