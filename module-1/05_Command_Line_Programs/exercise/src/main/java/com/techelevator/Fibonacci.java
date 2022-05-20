package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// Welcome message

		System.out.println("Welcome to the Fibonacci sequence generator! \n");

		// Accept user input

		System.out.println("Please enter a number:");
		Scanner input = new Scanner(System.in);
		String inputNumber = input.nextLine();

		// Parse the string into a double

		int intNumber = Integer.parseInt(inputNumber);

		// Define the variables for the calculation

		int num1 = 0;
		int num2 = 1;

		// Label the data we will be displaying

		System.out.println("\nFibonacci sequence up to " + intNumber + ":");

		// Start the sequence calculation. Referenced for guidance: https://www.geeksforgeeks.org/different-ways-to-print-fibonacci-series-in-java/

		while (num1 <= intNumber){

			System.out.print(num1);
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

			while (num1 <= intNumber) {
				System.out.print(", ");
				break;
			}

		}

		System.out.println("\n\nThank you for using our tool! \u263A ");




	}

}
