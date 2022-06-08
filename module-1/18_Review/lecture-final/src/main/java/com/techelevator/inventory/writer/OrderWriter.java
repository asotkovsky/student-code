package com.techelevator.inventory.writer;

import com.techelevator.inventory.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OrderWriter {

    public String writeOrder(List<Item> order) throws IOException {
        File file = new File("Order.txt");
        String resultOfWriteOrder = "No file written";

        try(PrintWriter printWriter = new PrintWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(printWriter)){
            for(Item item : order){
                bufferedWriter.write(item.getSku()+ ": " + item.getName() + " " + item.getTotalPrice());
                bufferedWriter.newLine();
            }
            resultOfWriteOrder = "The file was created";
        }

        return resultOfWriteOrder;
    }
}
