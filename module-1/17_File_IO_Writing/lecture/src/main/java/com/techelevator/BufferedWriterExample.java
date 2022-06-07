package com.techelevator;

import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) throws FileNotFoundException {

        /*
         * Create a file and PrintWriter
         */
        File file = new File("fileWrittenWithBuffering.txt");

        /*
         * To add buffering a Print Writer is still needed and will still do the writing.
         * A BufferedWriter is added and passed the Print Writer.  The Print Writer will still
         * write to the file and the buffered writer will provide buffering.
         */

        try (PrintWriter printWriter = new PrintWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(printWriter)){

            bufferedWriter.write("This is the first line of our new file. Written with a BufferedWriter.");
            bufferedWriter.newLine();

        } catch (IOException e){
            System.out.println("Unable to write to file: " + e.getMessage());
        }

    }
}
