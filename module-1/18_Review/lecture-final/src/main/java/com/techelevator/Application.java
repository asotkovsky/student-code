package com.techelevator;

import com.techelevator.inventory.Inventory;
import com.techelevator.inventory.Item;
import com.techelevator.inventory.view.Menu;

import java.util.Map;
import java.util.Scanner;

public class Application {

    private Menu menu;
    /*
        The Store
            Holds the Inventory
        Getting User Input
        Workflow

     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run(){

        menu = new Menu();
        Scanner userInput = new Scanner(System.in);
        Inventory inventoryBuilder = new Inventory();

        menu.showWelcomeMenu();

        Map<String, Item> inventory = inventoryBuilder.getInventory();


        menu.showItemsForSale(inventory);



        System.out.print("Item to purchase >>>");
        String skuToPurchase = userInput.nextLine();

        Item selectedItem = inventory.get(skuToPurchase);

        System.out.println("You selected to purchase a " + selectedItem.getName() + "at: " + selectedItem.getTotalPrice());


    }
    
}
