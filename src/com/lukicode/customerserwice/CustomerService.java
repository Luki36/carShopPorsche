package com.lukicode.customerserwice;

import com.lukicode.shop.Shop;

import java.time.LocalDate;

public class CustomerService {

    public static void main(String[] args) {

    Shop shop = new Shop("Luki Porsche Center","666 High Street",1345,
            LocalDate.of(2010,07,01));

        System.out.println(shop);
    }

}
