package com.lukicode.porschemodels;

import com.lukicode.porschemodel.*;

import java.util.ArrayList;
import java.util.List;

public class Model718 {

    //To jest tworzenie zmiennej klasowej tzn,
    // że w ramach klasy możemy odwoływać się do
    // tej zmiennej w różnych metodach bez większych ograncizeń @Kuba
    private List<Car> models;

    public Model718() {
        this.models = new ArrayList<>();
        this.models.add(new Cayman718());
        this.models.add(new CaymanS718());
        this.models.add(new CaymanGTS4_0_718());
        this.models.add(new CaymanT718());
        this.models.add(new CaymanGT4_718());
        this.models.add(new Boxster718());
        this.models.add(new BoxsterS718());
        this.models.add(new BoxsterGTS4_0_718());
        this.models.add(new BoxsterS718());
        this.models.add(new BoxsterT718());
        this.models.add(new Spyder718());
    }

    //Możemy np mieć taką metodę która nam doda Model718 do listy modeli @Kuba
    public void addModel718ToList(Car car){
        this.models.add(car);
    }


    public void print718Models(){
        for (Car model : models) {
            System.out.println("Model " + model.getModel() + " Cena " + model.getPrice());
        }
    }
}
