package com.techelevator.farm;

public abstract class FarmAnimal implements Singable, Sellable {
	private String name;
	private String sound;
	private double price;
	private boolean sleeping = false;

	public FarmAnimal(String name, String sound, double price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public abstract String eat();

	public String getName() {
		return name;
	}

	public final String getSound() {
		if (this.sleeping) {
			return "Zzzzzzzz....";
		}
		return sound;
	}

	public double getPrice() {
		return price;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public void sleep() {
		this.sleeping = true;
	}

	public void wake() {
		this.sleeping = false;
	}

}