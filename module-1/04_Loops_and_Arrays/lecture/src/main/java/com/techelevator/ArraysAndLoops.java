package com.techelevator;

public class ArraysAndLoops {
    //psvm
    public static void main(String[] args) {

//ARRAYS
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        numbers[3] = 45;

        if (numbers[2] == 30) {
            System.out.println("Index 2 contains a 30.");
        }

        numbers[1] = numbers[1] *= 2;

        System.out.println(numbers[1]);
/*
    LOOPS

 */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            sum += n;
        }
        System.out.println(sum);

        /*
        print every number that is a multiple of 3 between 28 and 998 in reverse
         */

        for (int i = 998; i >= 28; i--) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }

        /* Sum every other number

         */
        int sumOfEveryOtherNumber = 0;
        for (int n = 1; n <= 100; n += 2) {
            sumOfEveryOtherNumber = sumOfEveryOtherNumber + n;
        }
        System.out.println("Sum of every other number: " + sumOfEveryOtherNumber);

        /* Loops with Arrays

         */

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] instructors = new String[5];
        instructors[0] = "John";
        instructors[1] = "Rachelle";
        instructors[2] = "Steve";
        instructors[3] = "Matt";
        instructors[4] = "Dan";


        for (int i = 0; i < instructors.length; i++) {
            if (i % 2 == 1) {
                String hello = "Hello, " + instructors[i];
                System.out.println(hello);
                if (i == 2) {
                    break;
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                continue;
            }
            System.out.println(numbers[i]);
        }
}
        }


