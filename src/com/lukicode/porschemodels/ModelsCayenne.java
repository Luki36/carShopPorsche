package com.lukicode.porschemodels;

import com.lukicode.porschemodel.*;

import java.util.ArrayList;
import java.util.List;

public class ModelsCayenne {

    private List<Car> models;

    public ModelsCayenne() {
        this.models = new ArrayList<>();
        this.models.add(new Cayenne());
        this.models.add(new CayenneEHybrid());
        this.models.add(new CayenneGTS());
        this.models.add(new CayenneS());
        this.models.add(new CayenneTurbo());
        this.models.add(new CayenneTurboSEHibrid());
        this.models.add(new CayenneCoupe());
        this.models.add(new CayenneEHibrdCoupe());
        this.models.add(new CayenneSCoupe());
        this.models.add(new CayenneGTSCoupe());
        this.models.add(new CayenneTurboCoupe());
        this.models.add(new CayenneTurboSEHibidCoupe());
    }

    public List<Car> getModels() {
        return models;
    }

    public void setModels(List<Car> models) {
        this.models = models;
    }
    public void printCayenmodels(){
        for (Car model : models) {
            System.out.println("Model " + model.getModel() + " Cena " + model.getPrice());
        }
    }
}
