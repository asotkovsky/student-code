package com.techelevator;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean isDoorOpen = false;

    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }

    public void openDoor(){
        this.isDoorOpen = true;
    }

    public void closeDoor(){
        this.isDoorOpen = false;
    }

    public void goUp(int desiredFloor){
        if (!isDoorOpen){
            if (desiredFloor > this.currentFloor && desiredFloor <= this.numberOfFloors && desiredFloor > 0){
                this.currentFloor = desiredFloor;
            }
        }
    }

    public void goDown(int desiredFloor){
        if(!isDoorOpen){
            if (desiredFloor < this.currentFloor && desiredFloor <= this.numberOfFloors && desiredFloor > 0){
                this.currentFloor = desiredFloor;
            }
        }

    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public boolean isDoorOpen(){
        return isDoorOpen;
    }

}
