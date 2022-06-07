package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FileToUppercase {

    public static void main(String[] args) throws IOException {

        File originalFile = new File("Dracula.txt");
        File uppercaseFile = new File("Dracula-Uppercase.txt");

        try (Scanner fileReader = new Scanner(originalFile);
             PrintWriter newFileWriter = new PrintWriter(uppercaseFile);
             BufferedWriter fileWriterBuffer = new BufferedWriter(newFileWriter)) {

            while (fileReader.hasNextLine()) {
                String nextLineFromFile = fileReader.nextLine();
                nextLineFromFile = nextLineFromFile.toUpperCase();
                fileWriterBuffer.write(nextLineFromFile);
                fileWriterBuffer.newLine();
            }

            } catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
        System.out.println("\nUppercasing complete!");
    }
}
