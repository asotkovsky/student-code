package com.techelevator.farm;

public class MusicBox implements Sellable, Singable {

    public double getPrice() {
        return 20;
    }

    public String getName() {
        return "MusicBox";
    }

    public String getSound() {
        return "lalalalala!";
    }

    public String wind(){
        return "The music box is wound up";
    }

    public String play(){
        return getSound();
    }

}
