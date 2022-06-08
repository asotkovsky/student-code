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

    public String getSelectedSkuFromUser(){
        System.out.print("Item to purchase >>>");
        String skuToPurchase = userInput.nextLine();
        return skuToPurchase;
    }

    public void showUserSelectItem(Item selectedItem){
        System.out.println("You selected to purchase a " + selectedItem.getName() + " at: " + selectedItem.getTotalPrice());
    }

    public void displayError(String file_not_found) {
        System.out.println(file_not_found);
    }
}
