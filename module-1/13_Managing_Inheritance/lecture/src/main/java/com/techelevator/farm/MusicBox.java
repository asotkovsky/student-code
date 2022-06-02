package com.techelevator.farm;

public class MusicBox implements Sellable, Singable {

    public String getName() {
        return "Music Box";
    }

    public double getPrice() {
        return 10.25;
    }

    public String getSound() {
        return "lalalala!";
    }

    public String wind() {
        return "The music box is wound up";
    }

    public String play() {
        return getSound();
    }
}
