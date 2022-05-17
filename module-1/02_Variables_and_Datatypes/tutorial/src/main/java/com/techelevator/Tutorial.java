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
        double salesTax = costOfDinner * ((double)SALES_TAX_PERCENTAGE / 100.00);
        double costPerPerson = costOfDinner / (double)numberOfGuests;
        int numberOfDessertPieces = 22;
        int dessertPiecesPerPerson = numberOfDessertPieces / numberOfGuests;
        int dessertPiecesLeftOver = numberOfDessertPieces % numberOfGuests;
        // Greet the user
        System.out.println("********************************************");
        System.out.println("*** Welcome to the Restaurant Calculator ***");
        System.out.println("********************************************");
        System.out.println("Cost of dinner: $" + costOfDinner);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println ("Tip: $" + tip);
        System.out.println("Cost per person: $" + costPerPerson);
        System.out.println("Dessert pieces per person:" + dessertPiecesPerPerson);
        System.out.println("Dessert pieces left over:" + dessertPiecesLeftOver);
        /******************************************************************************/
        // Step 2: Calculate the sales tax and tip
        /******************************************************************************/


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
