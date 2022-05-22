package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {


    // Create method to convert km to mi

    public static double kilometersToMiles(double kilometers) {
        final double MILES_PER_KILOMETER = 0.621371;
        return kilometers * MILES_PER_KILOMETER;
    }

// Create method to convert mi to km

    public static double milesToKilometers(double miles) {
        final double KILOMETERS_PER_MILE = 1.60934;
        return miles * KILOMETERS_PER_MILE;
    }

    public static void main(String[] args) {

// Initialize scanner for user input

        Scanner input = new Scanner(System.in);

        // Welcome message

        System.out.println("Welcome to the Kilometer <--> Miles conversion tool!");

        // Define run again variable and allow user to run program multiple times so long as runAgain is true
        boolean runAgain = true;

        while (runAgain) {
            // Prompt user to enter start value(s)
            System.out.println("\nEnter distance value(s) to convert (if entering multiple separate with comma \",\"):");

            // Split string values and store user input in an array

            String inputDistanceStart = input.nextLine();
            String[] stringDistanceStartArray = inputDistanceStart.split( "[\\s,]+");

            // Parse string values into double values and store in new array

            double[] doubleDistanceStartArray = new double[stringDistanceStartArray.length];
            for (int i = 0; i < stringDistanceStartArray.length; i++) {
                doubleDistanceStartArray[i] = Double.parseDouble(stringDistanceStartArray[i]);
            }

//        // Prompt user to enter end value(s)
//
//        System.out.println("\nEnter a distance value(s) to end at (if entering multiple separate with comma \",\"):");
//
//        // Split string valued and store user input in a new array
//
//        String inputDistanceEnd = input.nextLine();
//        String[] stringDistanceEndArray = inputDistanceEnd.split(", ");
//
//        // Parse string values into double values and store in new array
//
//            double[] doubleDistanceEndArray = new double[stringDistanceEndArray.length];
//            for (int i = 0; i < stringDistanceEndArray.length; i++){
//                doubleDistanceEndArray[i] = Double.parseDouble(stringDistanceEndArray[i]);
//            }

            // Prompt user to enter starting value type (Mi) or (Km):

            System.out.println("\nIs the distance in miles or kilometers?");
            String inputDistanceValueType = input.nextLine();
            System.out.print("\n");
            // Determine if value is referring to km or miles

            char distanceValueType;
            if ((inputDistanceValueType.equalsIgnoreCase("k")) || (inputDistanceValueType.contains("km")) || (inputDistanceValueType.contains("kilo")) || (inputDistanceValueType == "KM")) {
                distanceValueType = 'K';

                for (int n = 0; n < doubleDistanceStartArray.length; n++) {
                    if (distanceValueType == 'M') {
                        double kilometers = milesToKilometers(doubleDistanceStartArray[n]);
                        System.out.println(doubleDistanceStartArray[n] + " miles is " + kilometers + " kilometers. ");
                    } else if (distanceValueType == 'K') {
                        double miles = kilometersToMiles(doubleDistanceStartArray[n]);
                        System.out.println(doubleDistanceStartArray[n] + " kilometers is " + miles + " miles. ");
                    }
                }

            } else if ((inputDistanceValueType.equalsIgnoreCase("M"))|| (inputDistanceValueType.contains("mi")) || (inputDistanceValueType.contains("mile")) || (inputDistanceValueType == "MI")) {
                distanceValueType = 'M';


                for (int n = 0; n < doubleDistanceStartArray.length; n++) {
                    if (distanceValueType == 'M') {
                        double kilometers = milesToKilometers(doubleDistanceStartArray[n]);
                        System.out.println(doubleDistanceStartArray[n] + " miles is " + kilometers + " kilometers. ");
                    } else if (distanceValueType == 'K') {
                        double miles = kilometersToMiles(doubleDistanceStartArray[n]);
                        System.out.println(doubleDistanceStartArray[n] + " kilometers is " + miles + " miles. ");
                    }
                }

            } else {
                System.out.println("Invalid distance type entered. Please try again and indicate \"km\" for Kilometers or \"mi\" for miles.");
            }
// Allow user to select if they want
            System.out.println("\nWould you like to run the program again? Y/N");
            String inputRunAgain = input.nextLine();
            if (inputRunAgain.equalsIgnoreCase("n")) {
                runAgain = false;
                System.out.println("\nThank you for using our converter! \u2661");
            }


//// Prompt user to enter increment by value and parse from string to double
//
//        System.out.println("How many it should increment by:");
//        String stringIncrementBy = input.nextLine();
//        double incrementBy = Double.parseDouble(stringIncrementBy);


        }


    }
}


