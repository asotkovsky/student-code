package com.techelevator;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */

import java.util.Scanner;

public class MartianWeight {

	public static void main(String[] args) {

		// Welcome and provide instructions
		System.out.println("Welcome to the Mars weight calculator!");
		System.out.println("Enter a series of Earth weights (comma-seperated) that you want to be calculated: ");
		Scanner input = new Scanner(System.in);

		// Provide input into array
		String inputEarthWeights = input.nextLine();
		String [] stringEarthWeights = inputEarthWeights.split(", ");

		// Parse string array to doubles in new array

		double [] doubleEarthWeights = new double[stringEarthWeights.length];
		for (int i = 0; i < stringEarthWeights.length; i++){
			doubleEarthWeights[i] = Double.parseDouble(stringEarthWeights[i]);

			// Calculate each value in the new array

			double[] doubleMartianWeights = new double[doubleEarthWeights.length];
			for (int j = 0; j < doubleMartianWeights.length; j++){
				double weightFactor = 0.378;
				doubleMartianWeights[j] = doubleEarthWeights[i] * weightFactor;
			}

// Display both the original and calculated weights back to the user

			System.out.println(doubleEarthWeights[i] + " lbs on Earth. " + doubleMartianWeights[i] + " lbs on Mars.");
		}




	}

}
