package com.techelevator.inventory;

public class Book extends Item{


    public Book(String sku, String name) {
        super(sku, name);
    }

    @Override
    public double getTotalPrice() {
        return getPrice();
    }
}
