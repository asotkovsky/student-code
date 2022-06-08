package com.techelevator.inventory.view;

import com.techelevator.inventory.Item;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Scanner userInput = new Scanner(System.in);

    public void showWelcomeMenu(){
        System.out.println("Welcome to Java Blue Mart");
        System.out.println();
    }

    public void showItemsForSale(Map<String, Item> inventory){
        System.out.println("Items for Sale");

        for ( Map.Entry<String, Item> mapEntry : inventory.entrySet()) {

            System.out.print( mapEntry.getValue().getSku() );
            System.out.print( " : " + mapEntry.getValue().getName() );
            System.out.print( " ( " + mapEntry.getValue().getDescription() + " ) ");
            System.out.println( " $" + mapEntry.getValue().getTotalPrice() );

        }
        System.out.println();
    }

}
