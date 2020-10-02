package com.lukicode.porschemodel;

public class CayenneSCoupe implements Car{
    @Override
    public String getModel() {
        return "Cayenne S Coupe";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 498000;
    }
}
