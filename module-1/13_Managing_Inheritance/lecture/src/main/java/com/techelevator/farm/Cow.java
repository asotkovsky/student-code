package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!", 1500);
	}

	@Override
	public String eat(){
		return "The chicken eats some grass.";
	}
}