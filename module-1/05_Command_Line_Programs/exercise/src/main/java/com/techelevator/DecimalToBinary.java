package com.techelevator;

// Import scanner
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		// Welcome message

		System.out.println("Welcome to the decimal to binary conversion tool!\n");

		boolean runAgain = true;


		// Prompt user to enter start value(s) and create array of split strings based in decimals

		System.out.println("Please enter in a series of decimal values:");
		Scanner input = new Scanner(System.in);
		String inputDecimals = input.nextLine();
		String[] decimalStrings = inputDecimals.split("[\\s,]+");

		// Parse string values into long
		// and store in a new array

		int[] decimals = new int[decimalStrings.length];

		for (int i = 0; i < decimalStrings.length; i++) {
			decimals[i] = Integer.parseInt(decimalStrings[i]);
			int decimalValue = decimals[i];
			decimalToBinary(decimalValue);
			System.out.print(" ");
		}

	}
	public static void decimalToBinary(int decimalValue){

		int binaryNumber[] = new int[1000];
		int index = 0;
		for (int j= 0; decimalValue >0; j++){

			binaryNumber[index ++] = decimalValue % 2 ;
			decimalValue = decimalValue / 2;
		}
		for(int i = index -1;i >= 0;i--){
			System.out.print(binaryNumber[i]);

		}
	}
}



//			for (int j = 0; j <= decimals.length; j++) {
//				int temp = decimals[i];
//				int bit = 1;
//				String binary = "";
//
//				while (temp % bit != 1) {
//					bit *= 2;
//				}
//
//				while (bit != 0) {
//					if ((temp % bit) == 1) {
//						binary = binary + "1";
//					} else {
//						binary = binary + "0";
//					}
//
//					if (bit == 1) {
//						bit = 0;
//					} else {
//						bit = bit / 2;
//					}
//				}
//				System.out.print(binary);
//			}
//		}
//	}
//}
		// Do the calculation and store output in new binary array

//			long[] binary = new long[decimals.length];
//			for (int j = 0; j < decimals.length; j++){
//				long num = decimals[j];
//				binary[j] = decimalToBinary(decimals[j]);
//				System.out.println(binary[j]);
//			}


//		public static int decimalToBinary (decimalValue){
//			while(int i = input.length){
//				int temp = input[i];
//				int bit = 1;
//				String binary = "";
//
//				while (temp % bit != 1) {
//					bit *= 2;
//				}
//
//				while (bit != 0) {
//					if ((temp % bit) == 1) {
//						binary = binary + "1";
//					} else {
//						binary = binary + "0";
//					}
//
//					if (bit == 1) {
//						bit = 0;
//					} else {
//						bit = bit / 2;
//					}
//				}
//				System.out.println(binary);
//			}
//		}
//	}

//
//		long remainder = 0;
//		long binaryOutput = 0;
//		long j = 1;
//
//		while (num != 0) {
//			remainder = num % 2;
//			j = num / 2;
//			binaryOutput = binaryOutput + (remainder * j);
//			j = j * 10;
//		}
//
//		return binaryOutput;
//	}
//		}


