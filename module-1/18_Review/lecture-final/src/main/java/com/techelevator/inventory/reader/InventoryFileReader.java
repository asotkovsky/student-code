package com.techelevator.inventory.reader;

import com.techelevator.inventory.Book;
import com.techelevator.inventory.Clothing;
import com.techelevator.inventory.Food;
import com.techelevator.inventory.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryFileReader {

    private final String inventoryFilePath;

    public InventoryFileReader(String inventoryFilePath){
        this.inventoryFilePath = inventoryFilePath;
    }

    public Map<String, Item> readInventory() throws FileNotFoundException {
        Map<String, Item> items = new HashMap<>();

        File file = new File(inventoryFilePath);

        try(Scanner fileScanner = new Scanner(file)){
            while(fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                Item itemPulledFromFile = buildItemFromLine(line);
                items.put(itemPulledFromFile.getSku(), itemPulledFromFile);
            }
        }
        return items;
    }

    private Item buildItemFromLine(String line){
        Item item = null;
        String[] parts = line.split("\\|");

        String sku = parts[0];
        String name = parts[1];
        String description = parts[2];
        String price = parts[3];
        String type = parts[4];

        if(type.equalsIgnoreCase("F")){
            item = new Food(sku, name);
        } else if(type.equalsIgnoreCase("C")){
            item = new Clothing(sku, name);
        } else if(type.equalsIgnoreCase("B")){
            item = new Book(sku, name);
        }
        item.setDescription(description);
        item.setPrice(Double.parseDouble(price));

        return item;
    }
}
