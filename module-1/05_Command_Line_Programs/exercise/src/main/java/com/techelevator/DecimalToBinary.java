package com.techelevator;

// Import scanner
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		// Welcome message

		System.out.println("Welcome to the decimal to binary conversion tool!\n");

		boolean runAgain = true;


			// Prompt user to enter start value(s) and create array of split strings based in input

			System.out.println("Please enter in a series of decimal values:");
			Scanner input = new Scanner(System.in);
			String inputDecimals = input.nextLine();
			String[] decimalStrings = inputDecimals.split("[\\s,]+");

			// Parse string values into long
		// and store in a new array

			long[] decimals = new long[decimalStrings.length];

			for (int i = 0; i < decimalStrings.length; i++) {
				decimals[i] = Long.parseLong(decimalStrings[i]);
				long binary = decimalToBinary(decimals[i]);
				System.out.println(binary);
			}

			// Do the calculation and store output in new binary array

//			long[] binary = new long[decimals.length];
//			for (int j = 0; j < decimals.length; j++){
//				long num = decimals[j];
//				binary[j] = decimalToBinary(decimals[j]);
//				System.out.println(binary[j]);
//			}

			}

	public static long decimalToBinary(long num){
		long remainder = 0;
		long binaryOutput = 0;
		long j = 1;

		while (num != 0) {
			remainder = num % 2;
			j = num / 2;
			binaryOutput = binaryOutput + (remainder * j);
			j = j * 10;
		}

		return binaryOutput;
	}
		}


