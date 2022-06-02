package com.techelevator.farm;

public final class Cat extends FarmAnimal {

    public Cat(double price){
        super("Cat", "meow!", price);
    }

//    Because the method getSound is final it cannot be overriden
//    @Override
//    public String getSound() {
//        return "MEOW!!!!!!";
//    }

}
