package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		List<String> listOfStrings = Arrays.asList(stringArray);
		return listOfStrings;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String[] listAsArray = stringList.toArray(new String[stringList.size()]);
		return listAsArray;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		List<String> listWithout4LetterWords = new ArrayList<String>();

		// 1 Look at each word in the list

		for (String word : stringArray) {

			// 2 For each word determine how many letters

			if (word.length() != 4) {

				// 3 put the word in the new list if it is not 4 letters
				listWithout4LetterWords.add(word);
			}
		}
		return listWithout4LetterWords;
	}


	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {

		// Initialize an empty Array List of Double
		List<Double> listOfDoubles = new ArrayList<Double>();

		// Look at every value on the array & list divide it by two
		for (int integer : intArray) {
			Double d = new Double(integer);
			d /= 2;
			listOfDoubles.add(d);
		}
		// Store the output of those caluclations to the Array List
		return listOfDoubles;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
	 */
	public Integer findLargest(List<Integer> integerList) {
		int largestInteger = 0;
		for (int integer : integerList) {
			if (integer > largestInteger) {
				largestInteger = integer;
			}
		}
		return largestInteger;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> oddOnlyList = new ArrayList<Integer>();
		for (int integer : integerArray) {
			if (integer % 2 == 1) {
				oddOnlyList.add(integer);
			}
		}
		return oddOnlyList;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 9, 44, 2, 88, 9], 9) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		boolean foundIt = false;
		int count = 0;

		// 1. Look at each #
		for (int number : integerList) {
			// 2. Check to see if the number is the given number
			if (number == intToFind) {
//				3. If it is the given number add it to the count
				count += 1;
			}
			// 3. When done checking all numbers, if the count is 2 or more then return TRUE else return FALSE
			if (count >= 2) {
				foundIt = true;
			}
		}
		return foundIt;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
	and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
	** INTERVIEW QUESTION **

	fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
	fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
	fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

	HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {

		//Create new blank list to store string values
		List<String> fizzBuzzList = new ArrayList<String>();

		// Check the current value of each index in the Array and add the appropriate to the string value to the fizzbuzz list
		for (int integer : integerArray) {
			if ((integer % 3 == 0) && (integer % 5 == 0)) {
				fizzBuzzList.add("FizzBuzz");
			} else if (integer % 3 == 0) {
				fizzBuzzList.add("Fizz");
			} else if (integer % 5 == 0) {
				fizzBuzzList.add("Buzz");
			} else {
				String intAsString = String.valueOf(integer);
				fizzBuzzList.add(intAsString);
			}

		}
		return fizzBuzzList;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		// Create a new Integer list to put the new interwoven values into
		List<Integer> interLeaveList = new ArrayList<Integer>();
		int longestListSize;
		if (listOne.size() > listTwo.size()) {
			longestListSize = listOne.size();
		} else {
			longestListSize = listTwo.size();
		}
		for (int i = 0; i < longestListSize; i++) {
			if ((listOne.size()) > i) {
				interLeaveList.add(listOne.get(i));
			}
			if ((listTwo.size()) > i) {
				interLeaveList.add(listTwo.get(i));
			}
		}
		return interLeaveList;

	}
}

