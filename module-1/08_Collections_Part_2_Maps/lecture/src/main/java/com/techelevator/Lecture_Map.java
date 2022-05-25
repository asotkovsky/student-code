package com.techelevator;

import java.util.*;

public class Lecture_Map {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> animalNoises = new HashMap<String, String>();

		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		animalNoises.put("Dog", "Bark");
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");

		animalNoises.put("Duck","Quack");

// Retrieve items from a map using get (key)

		String cowNoise = animalNoises.get("Cow");
		System.out.println("A cow says " + cowNoise);

// If the key does not exist then get() will return null

		System.out.println("The wolf says " + animalNoises.get("Wolf"));

// remove(key) removes the key/value pair from the map and returns the value

		String lionNoise = animalNoises.remove("Lion");

		boolean doesCatExistsAsAKeyInTheMap = animalNoises.containsKey("Cat");
		boolean doesMeowExistsAsAValueInTheMap = animalNoises.containsValue("Meow");




		System.out.println();
		System.out.println("####################");
		System.out.println("      MAP ORDER     ");
		System.out.println("####################");
		System.out.println();

		System.out.println("The values where inserted in the following order: 2, 10, 25, 1");


		// HashMap does not retain order
		System.out.println();
		System.out.println("  HASHMAP");
		System.out.println("Does not retain any order.  Instead it uses it's own internal ordering");

		Map<Integer, String> hashMapNumbersToWords = new HashMap<Integer, String>();

		hashMapNumbersToWords.put(2, "Two");
		hashMapNumbersToWords.put(10, "Ten");
		hashMapNumbersToWords.put(25, "Twenty-Five");
		hashMapNumbersToWords.put(1, "One");

		for (Integer number : hashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + hashMapNumbersToWords.get(number));
		}


		System.out.println();
		System.out.println("  LINKED HASHMAP");
		System.out.println("Retains the Order of Insertion");

		Map<Integer, String> linkedHashMapNumbersToWords = new LinkedHashMap<Integer, String>();

		linkedHashMapNumbersToWords.put(2, "Two");
		linkedHashMapNumbersToWords.put(10, "Ten");
		linkedHashMapNumbersToWords.put(25, "Twenty-Five");
		linkedHashMapNumbersToWords.put(1, "One");

		for (Integer number : linkedHashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + linkedHashMapNumbersToWords.get(number));
		}


		System.out.println();
		System.out.println("  TREEMAP");
		System.out.println("Retains the Natural Order of the Data Type");
		System.out.println();
		System.out.println("Natural Order when numbers are Integer");

		Map<Integer, String> treeMapNumbersToWords = new TreeMap<Integer, String>();

		treeMapNumbersToWords.put(2, "Two");
		treeMapNumbersToWords.put(10, "Ten");
		treeMapNumbersToWords.put(25, "Twenty-Five");
		treeMapNumbersToWords.put(1, "One");

		for (Integer number : treeMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + treeMapNumbersToWords.get(number));
		}


		System.out.println();
		System.out.println("TreeMap Natural Order when numbers are String");

		Map<String, String> treeMapNumbersAsStrings = new TreeMap<String, String>();

		treeMapNumbersAsStrings.put("2", "Two");
		treeMapNumbersAsStrings.put("10", "Ten");
		treeMapNumbersAsStrings.put("25", "Twenty-Five");
		treeMapNumbersAsStrings.put("1", "One");

		for (String number : treeMapNumbersAsStrings.keySet()) {
			System.out.println(number + " is " + treeMapNumbersAsStrings.get(number));

		}

		System.out.println();
		System.out.println("####################");
		System.out.println("     Problems     ");
		System.out.println("####################");
		System.out.println();

		/*
			Given the following Map, transfer half the funds from account 12345 to account 56789
		 */
		Map<Integer, Double> accounts = new HashMap<Integer, Double>();
		accounts.put(12345, 100d);
		accounts.put(56789, 200d);


		/*
			Given the following Array count how many times each name exists
		 */
		String[] names = {"Rachelle", "John", "Rachelle", "Steve", "Dan", "Matt", "John", "Matt", "Rachelle", "Steve", "John", "Rachelle", "Rachelle" };

		Map<String, Integer> nameCounts = new HashMap<>();

		for(String name : names){
			if (!nameCounts.containsKey(name)) {
				nameCounts.put(name, 1);
			}
			else {
				int count = nameCounts.get(name) + 1;
				nameCounts.put(name, count);
			}

		}

		/*
			Keep track of items you want to purchase at the store
			What collection would be best?

			Items: Apples, Oranges, Bread, Milk, Soup, Ceiling Cleaner, Duct Tape, Hot Glue Gun, Googly Eyes, Pink Glitter Glue
		 */



		/*
			Shuffle the given array of numbers
		 */
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };



		/*
			Create an Inventory for the following items
			What collection would work best?

			Example:
			A1: Candy Bar
			A2: Nut Bar
			A3: Bag of Chocolates
			B1: Potato Chips
			B2: Pretzels
			B3: Nutter Butters
			C1: Cat Treats
			C2: Dog Treats
			C3: Squirrel Treats
		 */

	}

}
