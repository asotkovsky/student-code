package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		boolean searchNewFile = true;

		while (searchNewFile == true) {
		System.out.println("Please enter the name of the file you would like to search: ");
		Scanner input = new Scanner(System.in);
		String filePath = input.nextLine();
		File file = new File(filePath);
		boolean promptUserForNewFile = false;



			boolean searchFileAgain = true;

			while (searchFileAgain == true) {
				System.out.println("Enter the word you would like to search the file for: ");
				String searchWord = input.nextLine();
				String caseSensitivity = "";

				while (caseSensitivity == "") {
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
							searchFileAgain = false;
							System.out.println("Would you like to check another file? (Y/N): ");
							String checkNewFile = input.nextLine();
							if ((checkNewFile.equalsIgnoreCase("Y")) || (checkNewFile.equalsIgnoreCase("Yes"))) {
								promptUserForNewFile = true;
								break;
							}

						}

						if (countOfWordOccurrences == 0) {
							System.out.println("No occurrences of the search word found.");
						}


						//		Tried to add an additional feature that printed the total number of occurrences of the word, but it was causing the test to fail. Commented out:
						//		finally {
						//			System.out.println("Count of word occurrences: " + countOfWordOccurrences);
						//		}

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
							searchFileAgain = false;
							System.out.println("\nWould you like to check another file? (Y/N): ");
							String checkNewFile = input.nextLine();
							if ((checkNewFile.equalsIgnoreCase("Y")) || (checkNewFile.equalsIgnoreCase("Yes"))) {
								promptUserForNewFile = true;
								break;
						}
						}


					} else {
						System.out.println("Hmm ... not sure what you meant. Please answer the question again with a \"Y\" or \"N\".\n");
					}
				}

				if (promptUserForNewFile == true) {
					break;
				}
				System.out.println("\nWould you like to search this file for another word? Y/N");
				String inputRunAgain = input.nextLine();
				if (inputRunAgain.equalsIgnoreCase("n")) {
					searchFileAgain = false;
					System.out.println();
				}

				if (promptUserForNewFile == true) {
					break;

				}

			}
		}
	}
}
