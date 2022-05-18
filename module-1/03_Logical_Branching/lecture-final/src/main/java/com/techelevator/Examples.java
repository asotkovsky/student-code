package com.techelevator;

public class Examples {

	public static void main(String[] args) {


		System.out.println("*******************************");
		System.out.println("*** IF STATEMENTS ***");
		System.out.println("*******************************");
		System.out.println();

		//----------------------------------------------------

		System.out.println("*** Basic if statement ***");

		int freezingPointFahrenheit = 32;
		int outsideTempFahrenheit = 80;
		if (outsideTempFahrenheit <= freezingPointFahrenheit) {
			System.out.println("Would you like a nice hot cup of coffee?");
		} else {
			System.out.println("Would you like a cool, refreshing iced mocha?");
		}

		//----------------------------------------------------

		System.out.println("*** if-else statement ***");

		boolean condition1 = false;
		boolean condition2 = true;
		if (condition1) {
			System.out.println("Condition 1 is true!");
		} else if (condition2) {
			System.out.println("Condition 2 is true!");
		}

		//----------------------------------------------------

		System.out.println("*** a boolean variable is valid boolean expression ***");

		boolean isSunny = true;
		if (isSunny) {
			System.out.println("Better wear some sun screen...");
		}

		//----------------------------------------------------

		System.out.println("*** if statements can be used with blocks ***");

		if (outsideTempFahrenheit > freezingPointFahrenheit) {
			System.out.println("Summer time!!!");
		} else {
			System.out.println("Dress in layers");
			System.out.println("Wear gloves");
			System.out.println("Wear hat");
			System.out.println("Wear scarf");
		}

		System.out.println("*******************************");
		System.out.println("*** VARIABLE SCOPE ***");
		System.out.println("*******************************");
		System.out.println();

		int firstVariable = 2;
		if (firstVariable > 0) {
			int secondVariable = firstVariable;
		}
		//int thirdVariable = secondVariable * 2; // this will cause a compile error because secondVariable is not "in scope"
		//int firstVariable = 3;  // this is a compiler error because we already have a variable named firstVariable in this scope
		int secondVariable = 7; // this is allowed because there is no variable named secondVariable in this scope

		boolean burnItDown = shouldBurnDownTheBuilding(14, 20);
	}

	static boolean shouldBurnDownTheBuilding(int numberOfEmployees, int piecesOfCake) {
		if (numberOfEmployees > piecesOfCake) {
			return true;
		} else {
			return false;
		}
	}

}
