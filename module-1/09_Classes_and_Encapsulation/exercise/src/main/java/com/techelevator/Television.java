package com.techelevator;

public class Television {

    // Instance variables

    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    // Methods

    public void turnOff(){
        this.isOn = false;
    }

    public void turnOn(){
        this.isOn = true;
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
    }

    public void changeChannel(int newChannel) {
        if (this.isOn && ((newChannel >= 3) && (newChannel <= 18))) {
            this.currentChannel = newChannel;
        }
    }

    public void channelUp(){
        if (isOn){
            if (currentChannel < 18){
                this.currentChannel += 1;
            }
            else {
                this.currentChannel = 3;
            }
            //todo check if currentchannel works here instead
        }
    }

    public void channelDown(){
        if (isOn){
            if (this.currentChannel > 3){
                this.currentChannel -= 1;
            }
            else {
                this.currentChannel = 18;
            }
        }
    }

    public void raiseVolume(){
        if (this.isOn && this.currentVolume < 10) {
            this.currentVolume += 1;
        }
    }

    public void lowerVolume(){
        if (this.isOn && this.currentVolume > 0) {
            this.currentVolume -= 1;
        }
    }

    // Getters

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume(){
        return currentVolume;
    }

}
