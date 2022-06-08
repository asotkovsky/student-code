package com.techelevator;

import com.techelevator.inventory.Inventory;
import com.techelevator.inventory.Item;
import com.techelevator.inventory.reader.InventoryFileReader;
import com.techelevator.inventory.view.Menu;

import java.io.FileNotFoundException;
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
        System.out.println("Please enter the path for the inventory file:");
        String path = userInput.nextLine();

        InventoryFileReader inventoryBuilder = new InventoryFileReader(path);

        menu.showWelcomeMenu();

        Map<String, Item> inventory = null;

        try {
            inventory = inventoryBuilder.readInventory();
        } catch (FileNotFoundException e) {
            menu.displayError("File not found");
        }


        menu.showItemsForSale(inventory);


        //Move this work to menu
        String skuToPurchase = menu.getSelectedSkuFromUser();


        Item selectedItem = inventory.get(skuToPurchase);

        menu.showUserSelectItem(selectedItem);


    }
    
}
