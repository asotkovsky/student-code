package com.techelevator.vehicle;

public class Bus {

    // adding private member variables to hold the state of our class

    private String routeName;
    private int passengers;
    private int gallonsOfGas = 50;
    private boolean isDoorOpen = false;
    private final static int totalNumberOfSeats = 40;

    // Create a constructor
    public Bus(String routeName){
        this.routeName = routeName;
    }

    public Bus(){

    }

    //define access to this class:
    // aka getters and setters

    public String getRouteName(){
        return routeName;
    }

    // Setters don't need to return anything, they just need to do something, hence void
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


    // add a derived property that tells the remaining seats on bus

    public int getRemainingSeats(){
        return totalNumberOfSeats - this.passengers;
    }

    // add some behaviors or functionality

    public void addGas(int numberOfGallons){
        this.gallonsOfGas += numberOfGallons;
    }

    public void openDoor(){
        this.isDoorOpen = true;
    }

    public void closeDoor(){
        this.isDoorOpen = false;
    }

    public boolean board(){
        if(isDoorOpen && getPassengers() >= 1){
            this.passengers += 1;
            return true;
        }
        return false;
    }


}


