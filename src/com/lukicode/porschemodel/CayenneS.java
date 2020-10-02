package com.lukicode.porschemodel;

public class CayenneS implements Car {
/*
    public CayenneS(Enuma opcja) {
    }
    }*/

    //private String skóra;

    @Override
    public String getModel() {
        return "Cayenne S";
    }

    @Override
    public double getEngine() {
        return 500.0;
    }

    @Override
    public double getPrice() {
        return 463000;
    }

    //setOption() {
    // if(1) {sktóra = czarna;}
    //else if(2) {skóra = beżowa i cerwona}
    // }
}
