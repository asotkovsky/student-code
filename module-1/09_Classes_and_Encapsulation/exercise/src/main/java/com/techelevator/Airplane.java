package com.techelevator;

public class Airplane {

    // Set states

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;

    //Derived variables

    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    // Constructor

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    // Methods (do stuff)

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass) {
            if (this.getAvailableFirstClassSeats() >= totalNumberOfSeats) {
                this.bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        } else if (this.getAvailableCoachSeats() >= totalNumberOfSeats) {
            this.bookedCoachSeats += totalNumberOfSeats;
            return true;
        }
        return false;
    }

    // Getters

    public String getPlaneNumber(){
        return planeNumber;
    }

    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats(){
        return totalCoachSeats;
    }

    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }

}
