package com.techelevator;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

class DiscountCalculator {


    /**
     * Write a program that calculates the new price for discounted items.
     * The program allows a user to set a discount amount in decimal form
     * and also allows the user to enter a series of prices, separated by spaces
     * Prices that end in .98 are special and are never discounted
     * */

    /**
     * The main method is the start and end of our program
     */


    public static void main(String[] args) {

        System.out.println("Welcome to the Discount Calculator! \n\nPlease enter discount percentage in the field below.\n\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter discount amount in decimal form (not %): ");

        String userInput = input.nextLine();

        System.out.println("You entered: " + userInput);

        double discount = Double.parseDouble(userInput);

        System.out.println("Enter prices of the items that discount applies to (separated by spaces):");

        String userSubmittedPrice = input.nextLine();

        String[] pricesArray = userSubmittedPrice.split(" ");

        double[] doublePricesArray = new double[pricesArray.length];

        double price = 0.0;

        double finalPrice = 0.0;

        for (int i = 0; i < pricesArray.length; i++) {

            doublePricesArray[i] = Double.parseDouble(pricesArray[i]);

            if (pricesArray[i].contains(".98")) {

                finalPrice = price;
            }

            double discountedPrice = doublePricesArray[i] * (1 - discount);

            finalPrice = discountedPrice;

//            if ((doublePricesArray[i] - .98) % 1 == 0){
//
//                finalPrice = doublePricesArray[i];
//            }

            System.out.println("Original price: " + doublePricesArray[i] + "\nDiscounted price is: " + finalPrice + "\n");
        }

    }
}


