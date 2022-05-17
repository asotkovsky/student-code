package com.techelevator;

public class Tutorial {
    public static void main(String[] args) {
        /******************************************************************************/
        // Step 1: Declare and initialize variables
        /******************************************************************************/
        double costOfDinner = 120.00;
        int tipPercent = 18;
        int numberOfGuests = 4;
        final double SALES_TAX_PERCENTAGE = 7.25;
        double tip = costOfDinner * ((double)tipPercent / 100.00);
        // Greet the user
        System.out.println("********************************************");
        System.out.println("*** Welcome to the Restaurant Calculator ***");
        System.out.println("********************************************");
        System.out.println("Cost of dinner: $" + costOfDinner);
        System.out.println("Sales Tax: $" + tip);
        /******************************************************************************/
        // Step 2: Calculate the sales tax and tip
        /******************************************************************************/
        double salesTAX = costOfDinner * (SALES_TAX_PERCENTAGE / 100.00);


        /******************************************************************************/
        // Step 3: Calculate the amount per person
        /******************************************************************************/


        /******************************************************************************/
        // Step 4: Given the total number of dessert pieces, determine the number each
        //      guest gets, and the number left over after each guest eats their pieces.
        /******************************************************************************/


        System.out.println("********************************************");
        System.out.println("** Thanks for using Restaurant Calculator **");
        System.out.println("********************************************");

    }
}
