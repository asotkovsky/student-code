package com.techelevator;

import org.junit.*;

public class MaxEnd3Test {

    /*
    All elements same number [5,5,5] > [5,5,5]
    Array with more than 5 elements > ?
    [1,2,3] > [3,3,3]
    [-1,-2,0] > [0,0,0]
    [3,2,1] > [3,3,3]
    [1,3,2] > [3,3,3]
     */

    private MaxEnd3 testTarget;

    @Before
    public void setup(){
        testTarget = new MaxEnd3();
    }

    @Test
    public void all_numbers_same(){
        int[] testArray = new int[]{ 5,5,5 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertEquals(testArray, actualReturnedArray);
    }

    @Test
    public void array_with_more_than_3_elements(){
        int[] testArray = new int[]{ 1,2,3,4,5 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertArrayEquals(new int[] { 5,5,5 }, actualReturnedArray);
    }

    // What's supposed to happen if the user provides an array with more than 3 elements?

    @Test
    public void naturally_incrementing_array(){
        int[] testArray = new int[]{ 1,2,3 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertArrayEquals(new int[] { 3,3,3 }, actualReturnedArray);
    }

    @Test
    public void array_with_negative_numbers(){
        int[] testArray = new int[]{ -2,-1,0 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertArrayEquals(new int[] { 0,0,0 }, actualReturnedArray);
    }

    @Test
    public void decrementing_array(){
        int[] testArray = new int[]{ 3,2,1 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertArrayEquals(new int[] { 3,3,3 }, actualReturnedArray);
    }

    @Test
    public void array_with_largest_number_in_middle(){
        int[] testArray = new int[]{ 1,3,2 };
        int[] actualReturnedArray = testTarget.makeArray(testArray);
        Assert.assertArrayEquals(new int[] { 2,2,2 }, actualReturnedArray);
    }

}
