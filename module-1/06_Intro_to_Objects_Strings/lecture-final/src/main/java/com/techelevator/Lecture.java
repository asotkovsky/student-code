package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {


		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create a new instance of String using a literal */

		String greeting = "Hello ";
		System.out.println(greeting);
		String uppercaseGreeting = greeting.toUpperCase();
		System.out.println(uppercaseGreeting);
		System.out.println(greeting);

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		//play with charAt
		String name = "Tech Elevator";
		System.out.println(name);
		char first = name.charAt(3);
		System.out.println(first);

		//contains() - returns true or false
		boolean nameContainsTor = name.contains("tor");
		System.out.println(nameContainsTor);
		boolean nameContainsNumnum = name.contains("numnum");
		System.out.println(nameContainsNumnum);
		String nameUpperCase = name.toUpperCase();
		boolean nameFixedForCaseContainsTOR = nameUpperCase.contains("TOR");
		System.out.println("This is the fixed contains:");
		System.out.println(nameFixedForCaseContainsTOR);

		boolean chainedUppercaseCall = name.toUpperCase().contains("TOR");
		System.out.println(chainedUppercaseCall);


		System.out.println(nameUpperCase.toLowerCase(Locale.ROOT));

		boolean nameEndsWith = name.endsWith("ar");
		System.out.println(nameEndsWith);

		String strAwesome = "Awesome";
		String partOfStrAwesome = strAwesome.substring(3, 5);
		System.out.println(partOfStrAwesome);

		String lastFourOfNameVariable = name.substring(name.length()-4);
		System.out.println(lastFourOfNameVariable);

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
		System.out.println(hello1);
        String hello2 = new String(helloArray);
		System.out.println(hello2);


		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
