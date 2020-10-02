package com.lukicode.porschemodels;

import com.lukicode.porschemodel.*;


import java.util.ArrayList;
import java.util.List;

public class Models911 {

    //TODO przerobić na zmienną klasową PD od Kuba

    public List<Car> getModels911List() {
        List<Car> m911list = new ArrayList<>();
        m911list.add(new Targa4_911());
        m911list.add(new Targa4S_911());
        m911list.add(new Targa4SHaritageDesignEdition_911());
        m911list.add(new Carrera911());
        m911list.add(new Carrera4_911());
        m911list.add(new Carrera4SCabrio_911());
        m911list.add(new CarreraSCabrio_911());
        m911list.add(new CarreraS_911());
        m911list.add(new Carrera4S_911());
        m911list.add(new Carrera4Cabrio_911());
        m911list.add(new CarreraCabrio911());
        m911list.add(new Turbo911());
        m911list.add(new TurboCabrio911());
        m911list.add(new TurboS_911());
        m911list.add(new TurboSCabrio_911());

        return m911list;
    }

    //a w tym przypadku nie możemy @Kuba
  /*  public void addModels911ToList(Car car){
        this.m911list.add(car);
    }*/

    public void printModels911() {
        for (Car model : getModels911List()) {
            System.out.println("Model " + model.getModel() + " Price " + model.getPrice());
        }
    }
}
