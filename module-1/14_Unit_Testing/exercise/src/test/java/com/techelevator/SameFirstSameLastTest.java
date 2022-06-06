package com.techelevator;

import org.junit.*;

public class SameFirstSameLastTest {

    /* What to test:
    [1,2,3] > false
    [1,1] > true
    [1] > false
    Empty array > false
     */

 private SameFirstLast testTarget;

 @Before
 public void setup(){
     testTarget = new SameFirstLast();
 }

 @Test
 public void two_different_numbers (){
     int[] testArray = new int[]{ 1, 2, 3 };
     boolean actualReturnedResult = testTarget.isItTheSame(testArray);
     Assert.assertEquals(false, actualReturnedResult);
 }

    @Test
    public void two_same_numbers (){
        int[] testArray = new int[]{ 1, 1 };
        boolean actualReturnedResult = testTarget.isItTheSame(testArray);
        Assert.assertEquals(true, actualReturnedResult);
    }

    @Test
    public void one_number (){
        int[] testArray = new int[]{ 1 };
        boolean actualReturnedResult = testTarget.isItTheSame(testArray);
        Assert.assertEquals(true, actualReturnedResult);
    }


    @Test
    public void empty_array (){
        int[] testArray = new int[]{ };
        boolean actualReturnedResult = testTarget.isItTheSame(testArray);
        Assert.assertEquals(false, actualReturnedResult);
    }

    // Should it return false here?



}
