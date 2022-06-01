package com.techelevator.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singers = new Singable[] { new Cow(), new Chicken(), new Sheep(), new Tractor() };
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

	}
}