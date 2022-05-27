package com.techelevator.vehicle;

public class Bus {

    //adding private member variables to hold the state of our class

    private String routeName;
    private int passengers;
    private int gallonsOfGas = 50;
    private boolean isDoorOpen = false;
    private final static int numberOfSeats = 40;

    public Bus(String routeName){
        this.routeName = routeName;
    }

    public Bus(){

    }

    //define access to this class:
    // aka getters setters

    public String getRouteName(){
        return routeName;
    }

    public void setRouteName(String routeName){
        this.routeName = routeName;
    }

    public int getPassengers(){
        return passengers;
    }

    public int getGallonsOfGas(){
        return gallonsOfGas;
    }

    public boolean isDoorOpen(){
        return isDoorOpen;
    }

    //add a derived property that tells the remaining seats on bus
    public int getRemainingSeats(){
        return numberOfSeats - passengers;
    }

    //add some behaviors or functionality
    //methods
    public int addGas(int gallons){
        this.gallonsOfGas += gallons;
        return gallonsOfGas;
    }

    public void openDoor(){
        this.isDoorOpen = true;
    }

    public void closeDoor(){
        this.isDoorOpen = false;
    }

    public boolean board(){
        if(isDoorOpen && getRemainingSeats() >= 1){
            this.passengers += 1;
            return true;
        }
        return false;
    }

}
