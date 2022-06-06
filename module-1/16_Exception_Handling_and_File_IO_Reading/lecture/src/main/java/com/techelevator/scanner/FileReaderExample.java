package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        // Get path from user


        System.out.println("Please tell us the path of the file you want to read: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        // Ask user how many lines to read

        boolean keepReading = true;

            System.out.println("How many lines of the file would you like to read? ");
            String numberOfLinesToRead = input.nextLine();
            int numberOfLines = Integer.parseInt(numberOfLinesToRead);
            int countOfLines = 0;

            // Create a file object from path

            File file = new File(path);

            // Open it with a try-with-resource (resource is the Scanner)

            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine() && countOfLines < numberOfLines) {
                    String line = fileScanner.nextLine();
                    countOfLines++;
                    System.out.println(countOfLines + " " + line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File " + file.getAbsolutePath() + " is not found.");
            }
        while (keepReading) {
            System.out.println("Would you like to keep reading? Y/N");

            String keepReadingInput = input.nextLine();
            if (keepReadingInput.equalsIgnoreCase("N"){
                keepReading = false;
                System.out.println("Thank you for reading!");
            }
            System.out.println("How many more pages would you like to read?");
            String moreLines = input.nextLine();

            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine() && (countOfLines < moreLines) {
                   line = fileScanner.nextLine();
                    countOfLines++;
                    System.out.println(countOfLines + " " + line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File " + file.getAbsolutePath() + " is not found.");


            }
        }

    }}