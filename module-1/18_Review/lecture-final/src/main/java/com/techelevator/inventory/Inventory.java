package com.techelevator.inventory;

import com.techelevator.inventory.Item;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    /*
    * sku | name | description | price | types
    * */


    public Map<String, Item> getInventory() {
        Item cake = new Food("001", "Cake");
        cake.setDescription("A chocolate cake");
        cake.setPrice(10);

        Item flipflops = new Clothing("002", "Flip Flop Sandals");
        flipflops.setDescription("Protect your feet, but only the bottoms");
        flipflops.setPrice(7);


        Map<String, Item> inventory = new HashMap<String, Item>();

        inventory.put(cake.getSku(), cake);
        inventory.put(flipflops.getSku(), flipflops);
        inventory.put("B1", new Book("B1", "Head First Java"));

        return inventory;
    }
}
