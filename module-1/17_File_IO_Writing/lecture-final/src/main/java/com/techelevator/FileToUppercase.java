package com.techelevator;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileToUppercase {

    public static void main(String[] args) throws IOException {

        File originalFile = new File("Dracula.txt");
        File newFile = new File("Dracula-uppercased.txt");

        try (Scanner fileReader = new Scanner(originalFile);
            PrintWriter newFileWriter = new PrintWriter(newFile);
             BufferedWriter fileWriterBuffer = new BufferedWriter(newFileWriter)) {

            while(fileReader.hasNextLine()) {
                String nextLineFromFile = fileReader.nextLine();
                nextLineFromFile = nextLineFromFile.toUpperCase();
                fileWriterBuffer.write(nextLineFromFile);
                fileWriterBuffer.newLine();
            }


        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }

        System.out.println("Uppercasing Complete!");
    }
}
