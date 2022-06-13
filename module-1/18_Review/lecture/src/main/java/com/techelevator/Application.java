package com.techelevator;

import com.techelevator.inventory.Inventory;
import com.techelevator.inventory.Item;
import com.techelevator.inventory.view.Menu;

import java.util.Map;
import java.util.Scanner;

public class Application {

    /*
        The Store
            Holds the Inventory
        Getting User Input
        Workflow

     */

    private Menu menu;

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

        String skuSelected = menu.selectItemToPurchase();
        Item selectedItem = inventory.get(skuSelected);

        System.out.println("You selected to purchase a: " + selectedItem.getName());


    }
    
}
