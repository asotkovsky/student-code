package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		// Welcome message

		System.out.println("Welcome to the meters <--> feet converter tool! \n");

		// Accept length input from user

		System.out.println("Enter a length: ");
		Scanner input = new Scanner(System.in);
		String inputLength = input.nextLine();

		// Convert input temperature string to double so we can do maths

		double doubleLength = Double.parseDouble(inputLength);

		// Accept input of 'F' or 'C' to represent Fahrenheit or Celsius

		System.out.println("Is the length in (m)eters, or (f)eet? (Enter \"m\" or \"f\")");
		String inputLengthFormat = input.nextLine();

		// Convert input temperature format into a char

		char charLengthFormatInput = inputLengthFormat.charAt(0);

		// Define Fahrenheit and Celsius variables

		double lengthMeters;
		double lengthFeet;

		// Determine which calculation to use (C --> F or F --> C) and do the maths

		if ((charLengthFormatInput == 'M')||(charLengthFormatInput == 'm')){
			lengthMeters = doubleLength;
			lengthFeet = lengthMeters * 3.2808399;

			// Display result of calculation to the user

			System.out.println("Length in meters: " + lengthMeters);
			System.out.println("Length in feet: " + lengthFeet + "\n");
			System.out.println("Thank you for using our calculator! \u2661");
		}
		else if ((charLengthFormatInput == 'F')||(charLengthFormatInput == 'f')){
			lengthFeet = doubleLength;
			lengthMeters = lengthFeet * 0.3048;

			// Display result of calculation to the user

			System.out.println("Length in meters: " + lengthMeters);
			System.out.println("Length in feet: " + lengthFeet + "\n");
			System.out.println("Thank you for using our calculator! \u2661");

		}
		// Show error message to user if they pass in an incorrect temperature type
		else {System.out.println("Invalid length format provided. Must provide \"m\" for meters  or \"f\" for feet.");
		}
	}

}