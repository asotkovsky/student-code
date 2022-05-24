package com.techelevator;

<<<<<<< HEAD
import javax.swing.text.DateFormatter;
import java.math.BigDecimal;
import java.sql.SQLOutput;
=======
import java.math.BigDecimal;
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


<<<<<<< HEAD
=======

>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
public class Lecture {

	public static void main(String[] args) {

<<<<<<< HEAD
		// Create a bid decimal

		BigDecimal firstNumber = new BigDecimal(10);
		BigDecimal secondNumber = BigDecimal.ZERO;
		//Will add 5 to second number:
=======
		/*
			BigDecimal
		 */
		BigDecimal firstNumber = new BigDecimal(10);
		BigDecimal secondNumber = BigDecimal.ZERO;

>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
		secondNumber = secondNumber.add( new BigDecimal(5) );

		BigDecimal numbersMultiplied = firstNumber.multiply(secondNumber);

<<<<<<< HEAD
=======

>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
		/*
			LocalDate
			java.time.LocalDate
		 */

<<<<<<< HEAD
		LocalDate today = LocalDate.now();
		System.out.println(today);

		//		Tomorrow's date
		LocalDate tomorrow = today.plusDays(1);;
		System.out.println(tomorrow);

		// Specific date
		LocalDate april122010 = LocalDate.of(2010, 04, 12);
		System.out.println(april122010);
=======
		// Today's date
		LocalDate today = LocalDate.now();

		// Tomorrow's date
		LocalDate tomorrow = today.plusDays(1);

		// Specific Date
		LocalDate april122010 = LocalDate.of(2010, 4, 13);
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

		// Specific Date from String
		LocalDate halloween1980 = LocalDate.parse("1980-10-31");


<<<<<<< HEAD
		// Datetime Formatter
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(dateFormatter.format(halloween1980));

=======
		// DateTimeFormatter can be used with LocalDate to format the date for printing or input
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(dateFormatter.format(halloween1980));


>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> instructors = new ArrayList<String>();

		instructors.add("John");
		instructors.add("Matt");
		instructors.add("Steve");
		instructors.add("Dan");
<<<<<<< HEAD

=======
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

<<<<<<< HEAD
		for (int i = 0; i < instructors.size(); i++){
			System.out.println(instructors.get(i));
=======
		for (int i = 0 ; i < instructors.size() ; i++) {
			System.out.println( instructors.get(i) );
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		instructors.add("John");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

<<<<<<< HEAD
		instructors.add(2,"Rachelle");

=======
		instructors.add(2, "Rachelle");
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove("Dan");
<<<<<<< HEAD
		instructors.remove(3);
=======
		instructors.remove(0);
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
<<<<<<< HEAD

=======
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
		System.out.println("Is Dan in the list: " + instructors.contains("Dan"));
		System.out.println("Is Rachelle in the list: " + instructors.contains("Rachelle"));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
<<<<<<< HEAD

		String nametoSearchFor = "Rachelle";
		int indexofRachelle = instructors.indexOf(nametoSearchFor);
		System.out.println("Index is: " + indexofRachelle);
=======
		String nameToSearchFor = "Rachelle";
		int indexOfRachelle = instructors.indexOf(nameToSearchFor);
		System.out.println("Index is: " + indexOfRachelle);
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorsAsArray = instructors.toArray( new String[ instructors.size() ] );
<<<<<<< HEAD
		// need to initiate the new array to house it on the Heap and specify a size of the size of the list

		/*
		Arrays can be turned into a list
		 */

		List<String> instructorsAsList = Arrays.asList(instructorsAsArray);
=======

		/*
			Arrays can be turned into a List
		 */
		List<String> instructorsAsListAgain = Arrays.asList(instructorsAsArray);
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8

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

<<<<<<< HEAD
		for(int i = 0; i < instructors.size(); i++){
			System.out.println(instructors.get(i));
		}

		for(String instructor : instructors){
			System.out.println( instructor );

		}
	// A for each loop can also be used with an array
	for (String namesFromArray :  instructorsAsArray){
		System.out.println( namesFromArray);
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
		System.out.println(primitivePi);
=======
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
>>>>>>> 74cd5b4cbd5764561fed13c33a4104a508f121d8
	}
}
