package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {
        /*
         * Step 1:  Create a File object that represents the file being written to
         *          This file must exist when using PrintWriter.  If it doesn't exist
         *          it must be created.
         */

        File fileToWrite = new File("fileToWrite.txt");

        /*
         * Step 2: Create a PrintWriter (or other FileWriter) in a try-with-resource and
         *         pass it the File object that represents the file to write to.
         */

        try (PrintWriter printWriter = new PrintWriter(fileToWrite)) {
            printWriter.println("This is the first line in our new file!");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
            /*
             * Step 3:  Call the print(), println(), or printf() method on the print writer
             *          and pass it the string to write to the file.  We can repeat this
             *          as many times as needed.  Each call to println() will write to a
             *          new line.
             */
    }

}
