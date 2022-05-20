package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {



    /**
     * Write a program that calculates the new price for discounted items.
     * The program allows a user to set a discount amount in decimal form
     * and also allows the user to enter a series of prices, separated by spaces
     *
     * Prices that end in .98 are special and are never discounted.
     *
     * */

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {
        System.out.println("Welcome - yo whats up!?! yo yo yo");

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the discount amount to apply: (in decimal form - aka no %)");

        String userInput = input.nextLine();

        System.out.println("You entered: " + userInput);

        double discount = Double.parseDouble(userInput);

        System.out.println("Enter prices to be discounted, separated by spaces:");

       String userSubmittedPrice = input.nextLine();

       String[] pricesArray = userSubmittedPrice.split(" ");

       double price = 0.0;

       double[] dblPricesArray = new double[pricesArray.length];

        System.out.println("Discounted price for valid prices : ");

       for(int i = 0; i < pricesArray.length; i++){

           dblPricesArray[i] = Double.parseDouble(pricesArray[i]);



           String valueCheck = "";


           //substring() returns a string that is starts at a specified index

           if(pricesArray[i].length() > 2){
               valueCheck = (pricesArray[i].substring(pricesArray.length));
           }

           //checking to see if the last part of the above string is equal to .98

            if(valueCheck.equals(".98")){
                //because of java rounding doubles, I separated formatting from printing the double
                System.out.printf("%10s", " ");
                System.out.print(dblPricesArray[i]);
            } else {
                //if the valueCheck string doesn't equal .98, apply the discount

                double newPrice = dblPricesArray[i] * (1 - discount);

                System.out.printf("%10.2f", newPrice);
            }



       }



    }

}
