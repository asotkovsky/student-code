package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        //get path from user
        System.out.println("Please tell us the path of the file you want to read.");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        //ask user how many lines to read
        System.out.println("How many line to read?");
        String numberOfLinesToRead = input.nextLine();
        int numberOfLines = Integer.parseInt(numberOfLinesToRead);
        int countOfLines = 0;
        //create file object from path
        File file = new File(path);

        //try-with-resource (resource is the Scanner)
        try(Scanner fileScanner = new Scanner(file)){
            //while loop has nextLine && less than number of lines provided
            while(fileScanner.hasNextLine() && countOfLines < numberOfLines){
                String line = fileScanner.nextLine();
                //print out the line read
                countOfLines ++;
                System.out.println(countOfLines + ") " + line);
            }

        } catch (FileNotFoundException ex){
            System.out.println("File "+ file.getAbsolutePath() + " not found");
        }


    }
}
