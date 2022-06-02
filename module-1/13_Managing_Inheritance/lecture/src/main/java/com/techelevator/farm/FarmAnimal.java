package com.techelevator.farm;

public class FarmAnimal implements Singable, Sellable {
	private String name;
	private String sound;
	private double price;
	private boolean sleeping = false;

	public FarmAnimal(String name, String sound, double price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {

		if(this.sleeping){
			return "Zzzzzz ....";
		}
		return sound;
	}

	public double getPrice() {
		return price;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public void sleep(){
		this.sleeping = true;
	}

	public void wake(){
		this.sleeping = false;
	}

}