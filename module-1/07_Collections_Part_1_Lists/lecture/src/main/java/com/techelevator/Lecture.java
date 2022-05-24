package com.techelevator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Lecture {

	public static void main(String[] args) {

		/*
			BigDecimal
		 */
		BigDecimal firstNumber = new BigDecimal(10);
		BigDecimal secondNumber = BigDecimal.ZERO;

		secondNumber = secondNumber.add( new BigDecimal(5) );

		BigDecimal numbersMultiplied = firstNumber.multiply(secondNumber);


		/*
			LocalDate
			java.time.LocalDate
		 */

		// Today's date
		LocalDate today = LocalDate.now();

		// Tomorrow's date
		LocalDate tomorrow = today.plusDays(1);

		// Specific Date
		LocalDate april122010 = LocalDate.of(2010, 4, 13);

		// Specific Date from String
		LocalDate halloween1980 = LocalDate.parse("1980-10-31");


		// DateTimeFormatter can be used with LocalDate to format the date for printing or input
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(dateFormatter.format(halloween1980));


		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> instructors = new ArrayList<String>();

		instructors.add("John");
		instructors.add("Matt");
		instructors.add("Steve");
		instructors.add("Dan");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0 ; i < instructors.size() ; i++) {
			System.out.println( instructors.get(i) );
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		instructors.add("John");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(2, "Rachelle");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove("Dan");
		instructors.remove(0);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		System.out.println("Is Dan in the list: " + instructors.contains("Dan"));
		System.out.println("Is Rachelle in the list: " + instructors.contains("Rachelle"));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		String nameToSearchFor = "Rachelle";
		int indexOfRachelle = instructors.indexOf(nameToSearchFor);
		System.out.println("Index is: " + indexOfRachelle);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorsAsArray = instructors.toArray( new String[ instructors.size() ] );

		/*
			Arrays can be turned into a List
		 */
		List<String> instructorsAsListAgain = Arrays.asList(instructorsAsArray);

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(instructors);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (String name : instructors) {
			System.out.println( name );
		}

		// Can also be used with an Array
		for (String nameFromArray : instructorsAsArray) {
			System.out.println(nameFromArray);
		}


		List<Integer> numbers = new ArrayList<Integer>();

		Integer x = new Integer(10);
		Integer y = new Integer("20");
		numbers.add(x);
		numbers.add(y);
		numbers.add(30);
		numbers.add(40);

		int sum = x + y;

		Double pi = 3.14;
		double primitivePi = pi;
	}
}
