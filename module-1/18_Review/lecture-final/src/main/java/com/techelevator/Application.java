package com.techelevator;

import com.techelevator.inventory.Inventory;
import com.techelevator.inventory.Item;
import com.techelevator.inventory.reader.InventoryFileReader;
import com.techelevator.inventory.view.Menu;
import com.techelevator.inventory.writer.OrderWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

    private Menu menu;
    Map<String, Item> inventory = null;
    List<Item> order = new ArrayList<>();
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


        try {
            inventory = inventoryBuilder.readInventory();
        } catch (FileNotFoundException e) {
            menu.displayError("File not found");
        }

        purchaseItems();

        OrderWriter orderWriter = new OrderWriter();
        String resultOfOrderWriter = "";

        try {
            resultOfOrderWriter = orderWriter.writeOrder(order);
        } catch (IOException e) {
            menu.displayError("Something went wrong writing this file: " + e.getMessage());
        }

        menu.displayEndOfOrder(resultOfOrderWriter);

    }

    private void purchaseItems(){

        while(true){
            menu.showItemsForSale(inventory);
            String skuToPurchase = menu.getSelectedSkuFromUser();
            Item selectedItem = inventory.get(skuToPurchase.toUpperCase());

            //add item to order list
            order.add(selectedItem);

            menu.showUserSelectItem(selectedItem);

            String userResponse = menu.getInputFromUser("Do you wish to continue?(Y/N)");
            if(userResponse.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
}
