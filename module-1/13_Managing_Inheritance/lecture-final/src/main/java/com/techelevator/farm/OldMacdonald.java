package com.techelevator.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow singingCow = new Cow();
		singingCow.sleep();

		Cat singingCat = new Cat(100);
		singingCat.sleep();

		// FarmAnimal can be used as a superclass, but not instantiated directly because it is abstract
		//FarmAnimal farmAnimal = new FarmAnimal("Pig", "oink!", 0);

		Singable[] singers = new Singable[] { singingCow, new Chicken(),
				new Sheep(), new Tractor(), singingCat };
		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Sheep() };

		for (Singable animal : singers) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		List<Sellable> itemsForSale = new ArrayList<Sellable>();

		Sellable cow = new Cow();
		itemsForSale.add( cow );

		Sellable chicken = new Chicken();
		itemsForSale.add( chicken );

		Sellable sheep = new Sheep();
		itemsForSale.add( sheep );

		Sellable egg = new Egg();
		itemsForSale.add( egg );

		System.out.println();
		System.out.println("----- FOR SALE -----");

		for(Sellable animalForSale : itemsForSale) {
			System.out.print(animalForSale.getName());
			System.out.println(" : $" + animalForSale.getPrice());
		}

		MusicBox asMusicBox = new MusicBox();
		asMusicBox.setId(1);

		asMusicBox.getName();
		asMusicBox.getSound();
		asMusicBox.getPrice();
		asMusicBox.play();
		asMusicBox.wind();

		Singable asSingable = asMusicBox;
		asSingable.getName();
		asSingable.getSound();

		Sellable asSellable = (Sellable) asSingable;
		asSellable.getName();
		asSellable.getPrice();

		MusicBox backToMusicBox = (MusicBox) asSellable;
		backToMusicBox.getName();
		backToMusicBox.getSound();
		backToMusicBox.getPrice();
		backToMusicBox.wind();
		backToMusicBox.play();



		MusicBox musicBoxTwo = new MusicBox();
		musicBoxTwo.setId(1);

		if (asMusicBox.equals(asSellable)) {
			System.out.println("Original Musicbox is the same objects asSellable");
		}

		if (asMusicBox.equals(musicBoxTwo)) {
			System.out.println("Musicbox is equal to musicbox2 because they have the same id");
		}

		asMusicBox.equals( new Cow() );

	}
}