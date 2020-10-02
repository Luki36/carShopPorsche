package com.lukicode.porschemodel;

public class CayenneGTSCoupe implements Car{
    @Override
    public String getModel() {
        return "Cayenne GTS Coupe";
    }

    @Override
    public double getEngine() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 590000;
    }
}
