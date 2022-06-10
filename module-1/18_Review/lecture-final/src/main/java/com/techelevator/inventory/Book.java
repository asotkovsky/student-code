package com.techelevator.inventory;

public class Book extends Item implements Taxable{

    private double taxRate = 0.05;

    public Book(String sku, String name) {
        super(sku, name);
    }

    @Override
    public double getTaxRate() {
        return taxRate;
    }

    @Override
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double getTotalPrice() {
        return getPrice() + (getPrice() * getTaxRate());
    }
}
