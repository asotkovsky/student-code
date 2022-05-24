package com.techelevator;

public class ArraysAndLoops {

    // psvm
    public static void main(String[] args) {

        /*
            ARRAYS
         */
        int[] nums = new int[]{};
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] numbersInitializedStatically = new int[] { 10, 20, 30, 40, 50 };
        //int[] numbersInitializedStatically = { 10, 20, 30, 40, 50 };


        numbers[3] = 45;

        if (numbers[2] == 30) {
            System.out.println("Index 2 contains a 30");

            int a = 5;
            a += 2;
        }

        numbers[1] = numbers[1] * 2;


        //numbers[5] = 500;

        double a = 10;
        double b = 20;
        double c = 30;

        double[] doubleNumbers = { a, b, c};

        int numberOfStudents = 19;
        String[] namesOfStudentsInClass = new String[numberOfStudents];


        /*
            LOOPS
         */

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println( i );
        }

        int sum = 0;
        for (int n = 1 ; n <= 100 ; n++ ) {
            sum = sum + n;
        }
        System.out.println(sum);

        /*
             print every number that is a multiple of 3 between 28 and 998 in reverse
         */
        for (int i = 998 ; i >= 28 ; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        /*
            Sum every other number between 1 and 100
         */
        int sumOfEveryOtherNumber = 0;
        for (int n = 1 ; n <= 100 ; n += 2 ) {
            sumOfEveryOtherNumber = sumOfEveryOtherNumber + n;
        }
        System.out.println(sumOfEveryOtherNumber);


        /*
            Loops with Arrays
         */
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i] );
        }

        String[] instructors = new String[5];
        instructors[0] = "John";
        instructors[1] = "Rachelle";
        instructors[2] = "Steve";
        instructors[3] = "Matt";
        instructors[4] = "Dan";

        for (int i = 0; i < instructors.length; i++) {
            String hello = "Hello, " + instructors[i];
            System.out.println(hello);
        }


        /*
            Print out only the instructors odd numbers
         */
        for (int i = 0; i < instructors.length; i++) {
            if ( i % 2 == 1){
                String hello = "Hello, " + instructors[i];
                System.out.println(hello);
            }
        }

        /*
            Break keyword - ends the loop early
         */
        for (int i = 0; i < instructors.length; i++) {
            String hello = "Hello, " + instructors[i];
            System.out.println(hello);
            if (i == 2) {
                break;
            }
            System.out.println("This line runs if it didn't break");
        }

        /*
            Uses continue to skip the number 30
         */
        for (int i = 0 ; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                continue;
            }
            System.out.println(numbers[i]);
        }

        /*
            Skip the next number after 30
         */
        for (int i = 0 ; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                i++;
            }
            System.out.println(numbers[i]);
        }



    }
}
