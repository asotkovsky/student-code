package com.techelevator.farm;

public class Sheep extends FarmAnimal {

    public Sheep() {
        super("Sheep", "baa!", 500);
    }

    @Override
    public String eat() {
        return "The sheep eats";
    }
}
