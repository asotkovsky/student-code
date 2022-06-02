package com.techelevator.farm;

public final class Cat extends FarmAnimal {

    public Cat(double price) {
        super("Cat", "meow!", price);
    }

    // Because getSound() is final in the superclass, it can not be Overriden
//    @Override
//    public String getSound() {
//        return "MEOW!!!!";
//    }

    @Override
    public String eat() {
        return "The cat munches some cat food";
    }
}
