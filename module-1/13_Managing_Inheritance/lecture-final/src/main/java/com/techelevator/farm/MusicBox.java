package com.techelevator.farm;

public class MusicBox implements Sellable, Singable {

    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MusicBox)) {
            return false;
        }
        MusicBox other = (MusicBox) obj;
        return this.id == other.getId();
    }
}
