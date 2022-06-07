package com.techelevator;

public class HotelReservation {

    // Declaring member variables:

    private String name = "";
    private int numberOfNights;
    private final double dailyRate = 59.99;
    private double estimatedTotal;
    private double actualTotal;
    private final double cleaningFee = 34.99;
    private final double miniBarFee = 12.99;

    // Constructor

    public HotelReservation (String name, int numberOfNights){
        this.name = name;
        this.numberOfNights = numberOfNights;
        this.estimatedTotal = numberOfNights * dailyRate;
    }

    public HotelReservation (){

    }

    // Method to calculate actualTotal

    public double getActualTotal(boolean requiresCleaning, boolean usedMiniBar){
        this.actualTotal = this.estimatedTotal;

        if (requiresCleaning && usedMiniBar){
            this.actualTotal += ((cleaningFee * 2) + miniBarFee);
        }

        if (requiresCleaning){
            this.actualTotal += cleaningFee;
        }

        if (usedMiniBar){
            this.actualTotal += miniBarFee;
        }

        return this.actualTotal;
    }

    // Override toString() method

    @Override
    public String toString(){
        return "RESERVATION - " + this.name + " - " + this.estimatedTotal;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getEstimatedTotal(int numberOfNights) {
        return this.numberOfNights * dailyRate;
    }


}
