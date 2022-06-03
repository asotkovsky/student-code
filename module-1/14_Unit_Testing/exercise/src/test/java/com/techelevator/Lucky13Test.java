package com.techelevator;

import org.junit.*;

public class Lucky13Test {

    /* Tests to write
    Array with a 1 > false
    Array with a 3 > false
    Array with both 1 and 3 > false
    Array without 1 or 3 > true
    Array with negative number and no 1 or 3 > true
    Array with negative number and 1 and 3 > false
     */

    private Lucky13 testTarget;

    @Before
    public void setup(){
        testTarget = new Lucky13();
    }

    @Test
    public void array_with_1_returns_false(){
        int[] testArray = new int[]{ 4,5,7,1,8 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(false, actualReturnedResult);
    }

    @Test
    public void array_with_3_returns_false(){
        int[] testArray = new int[]{ 4,5,7,3,8 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(false, actualReturnedResult);
    }

    @Test
    public void array_with_1_and_3_returns_false(){
        int[] testArray = new int[]{ 3,5,7,1,8 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(false, actualReturnedResult);
    }

    @Test
    public void array_without_1_or_3_returns_true(){
        int[] testArray = new int[]{ 4,5,7,8 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(true, actualReturnedResult);
    }

    @Test
    public void array_with_negative_but_no_1_or_3_returns_true(){
        int[] testArray = new int[]{ 4,5,7,-5,8, -3 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(true, actualReturnedResult);
    }

    @Test
    public void array_with_negative_and_1_and_3_returns_false(){
        int[] testArray = new int[]{ 4,-5,7,1, 3, 8 };
        boolean actualReturnedResult = testTarget.getLucky(testArray);
        Assert.assertEquals(false, actualReturnedResult);
    }

}
