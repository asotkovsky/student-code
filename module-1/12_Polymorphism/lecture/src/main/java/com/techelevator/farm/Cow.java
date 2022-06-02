package com.techelevator.farm;

public class Cow extends FarmAnimal implements Singable {

	public Cow() {
		super("Cow", "moo!", 100);
	}

	public String getName(){
		return "Cow";
	}
	public String getSound(){
		return "moo!";
	}

	public double getPrice(){
		return 100;
	}

}