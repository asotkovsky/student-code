package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		// Welcome message

		System.out.println("Welcome to the temperature converter! \n");

		// Accept temperature input from the user

		System.out.println("Enter a temperature: ");
		Scanner input = new Scanner(System.in);
		String inputTemperature = input.nextLine();

		// Convert input temperature string to double so we can do maths

		double doubleTemperature = Double.parseDouble(inputTemperature);

		// Accept input of 'F' or 'C' to represent Fahrenheit or Celsius

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String inputTemperatureFormat = input.nextLine();

		// Convert input temperature format into a char

		char charTemperatureTypeInput = inputTemperatureFormat.charAt(0);

		// Define Fahrenheit and Celsius variables

		double temperatureFahrenheit;
		double temperatureCelsius;

		// Determine which calculation to use (C --> F or F --> C) and do the maths

		if ((charTemperatureTypeInput == 'C')||(charTemperatureTypeInput == 'c')){
			temperatureCelsius = doubleTemperature;
			temperatureFahrenheit = temperatureCelsius * 1.8 + 32;

			// Display result of calculation to the user

			System.out.println("Temperature in Celsius: " + temperatureCelsius + "\u00B0 C");
			System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit + "\u00B0 F \n");
			System.out.println("Thank you for using our calculator! \u2661");
		}
		else if ((charTemperatureTypeInput == 'F')||(charTemperatureTypeInput == 'f')){
			temperatureFahrenheit = doubleTemperature;
			temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;

			// Display result of calculation to the user

			System.out.println("Temperature in Celsius: " + temperatureCelsius + "\u00B0 C");
			System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit + "\u00B0 F \n");
			System.out.println("Thank you for using our calculator! \u2661");
		}
		// Show error message to user if they pass in an incorrect temperature type
			else {System.out.println("Invalid temperature type provided. Must provide \"C\" for Celsius or \"F\" for Fahrenheit.");
			}
	}

}
