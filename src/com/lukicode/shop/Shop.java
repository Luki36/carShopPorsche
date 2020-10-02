package com.lukicode.shop;

import com.lukicode.porschemodel.Car;

import java.time.LocalDate;


public class Shop {

    private String Shopname;
    private String Shopaddres;
    private int Storearea;
    private LocalDate startShopDate;



    public Shop(String shopname, String shopaddres,int storearea, LocalDate startShopDate) {
        Shopname = shopname;
        Shopaddres = shopaddres;
        Storearea = storearea;
        this.startShopDate = startShopDate;

    }

    @Override
    public String toString() {
        return "\"" +Shopname + "\"" +"\n"+ " Since " + startShopDate + "\n" + " Store Area " + Storearea+ " m2" +"\n" + " Addres: " + Shopaddres ;

    }
}
