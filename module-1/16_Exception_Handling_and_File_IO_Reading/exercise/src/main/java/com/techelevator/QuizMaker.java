package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		System.out.println("Enter the fully qualified name of the file to read: ");
		Scanner input = new Scanner(System.in);
		String filePath = input.nextLine();

		File file = new File(filePath);

		String[] arrOfQuizQuestionsAndAnswers = new String[1000];

		try (Scanner fileScanner = new Scanner(file)){
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				arrOfQuizQuestionsAndAnswers = line.split("\\|");


			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + file.getAbsolutePath() + " is not found.");
		}
		}

	}


