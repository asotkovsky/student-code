package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

			System.out.println("Please enter the name of the file you would like to search: ");
			Scanner input = new Scanner(System.in);
			String filePath = input.nextLine();

			File file = new File(filePath);

				System.out.println("Enter the word you would like to search the file for: ");
				String searchWord = input.nextLine();
				String caseSensitivity = "";

					System.out.println("Should the search be case sensitive? (Y/N)");
					String caseSensitiveInput = input.nextLine();


					if ((caseSensitiveInput.equalsIgnoreCase("Y")) || (caseSensitiveInput.equalsIgnoreCase("Yes"))) {
						caseSensitivity = "yes";
						int countOfWordOccurrences = 0;
						int countOfLines = 1;

						try (Scanner fileScanner = new Scanner(file)) {
							while (fileScanner.hasNextLine()) {
								String line = fileScanner.nextLine();
								if (line.contains(searchWord)) {
									System.out.println(countOfLines + ") " + line);
									countOfWordOccurrences++;
								}
								countOfLines++;
							}
						} catch (FileNotFoundException e) {
							System.out.println("File " + file.getAbsolutePath() + " is not found.");
							}


					} else if ((caseSensitiveInput.equalsIgnoreCase("N")) || (caseSensitiveInput.equalsIgnoreCase("No"))) {
						caseSensitivity = "no";
						int countOfWordOccurrences = 0;
						int countOfLines = 1;

						try (Scanner fileScanner = new Scanner(file)) {
							while (fileScanner.hasNextLine()) {
								String line = fileScanner.nextLine();
								String lowercaseLine = line.toLowerCase();
								String lowercaseSearchWord = searchWord.toLowerCase();
								if (lowercaseLine.contains(lowercaseSearchWord)) {
									System.out.println(countOfLines + ") " + line);
									countOfWordOccurrences++;
								}
								countOfLines++;
							}
							if (countOfWordOccurrences == 0) {
								System.out.println("No occurrences of the search word found.");
							}
						} catch (FileNotFoundException e) {
							System.out.println("File " + file.getAbsolutePath() + " is not found.");
							}
						}

				}

				}



