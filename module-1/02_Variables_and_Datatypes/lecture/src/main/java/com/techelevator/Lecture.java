package com.techelevator;

import java.sql.SQLOutput;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/

		int numberOfExercises; // Declaration
		numberOfExercises = 26; //Assignment

		System.out.println("Number of exercises: " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half = 0.5;

		System.out.println("Half: " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "Tech Elevator";

		System.out.println("Name: " + name);

		/*

		/* Create a variable called letter and declare it as 't'.

		*/

		char letter = 't';
		System.out.println("Letter: " + letter);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;

		System.out.println("Seasons of Firefly: " + seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";

		System.out.println("My favorite language: " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		final double PI = 3.1416;
		System.out.println("Pi: " + PI);

		/*
		7. Create and set a variable that holds your name.
		*/

		final String myName = "Alex";
		System.out.println("My name: " + myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		int numberOfButtonsOnMouse = 2;
		System.out.println("Number of buttons on mouse: " + numberOfButtonsOnMouse);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

		float percentageOfBatteryRemaining = 75.45F;
		System.out.println("Percentage of battery remaining: " + percentageOfBatteryRemaining);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int difference = 121 - 27;
		System.out.println("Difference: " + difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double numberOne = 12.3;
		double numberTwo = 32.1;
		double sumOfOneAndTwo = numberOne + numberTwo;
		System.out.println("Sum of one and two: " + sumOfOneAndTwo);

		/*
		12. Create a String that holds your full name.
		*/

		String myFullName = "Alex Sotkovsky";

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String fullNameWithHello = "Hello, " + myFullName;
		System.out.println(myFullName);
		System.out.println(fullNameWithHello);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		myFullName = myFullName + " Esquire";
		System.out.println(myFullName + " " + fullNameWithHello);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

		myFullName += " Esquire"; // This is a shortcut that is equivalent to the syntax in #14

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

		String tool = "Saw" + 2;
		System.out.println(tool);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

		tool += 0;
		System.out.println(tool);

		/*
		18. What is 4.4 divided by 2.2?
		*/

		double resultOf18 = 4.4 / 2.2;
		System.out.println(resultOf18);

		/*
		19. What is 5.4 divided by 2?
		*/

		System.out.println(5.4 / 2);

		/*
		20. What is 5 divided by 2?
		*/

		System.out.println((double)5 / (double)2);

		/*
		21. What is 5.0 divided by 2?
		*/

		System.out.println(5.0 / 2);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		System.out.println(66.6 /100);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/

		int remainder = 5 % 2;
		System.out.println(remainder);

		/*
		24. What is 1,000,000,000 * 3?
		*/

		int largeNumber = 1000000000 * 3;
		System.out.println(1000000000L * 3);

		/*
		25. Create a variable that holds a boolean called isDoneWithExercises and
		set it to false.
		*/

		Boolean isDoneWithExercises = false;
		System.out.println(isDoneWithExercises);

		/*
		26. Now set isDoneWithExercise to true.
		*/

		Boolean isDoneWithExercise = true;
		System.out.println(isDoneWithExercise);
		
	}

}
