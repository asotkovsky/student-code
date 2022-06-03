package com.techelevator;

import org.junit.*;

public class Less20Test {

    /*
    Tests to complete:
    - Negative number > false
    - 40 > false
    - 39 > true
    - 10 > false
    - 41 > false

     */

    private Less20 testTarget;

    @Before
    public void setup(){
        testTarget = new Less20();
    }

    @Test
    public void negative_number_returns_false(){
        // Arrange
        // Act
        boolean actualReturnedValue = testTarget.isLessThanMultipleOf20(-1);
        // Assert
        Assert.assertEquals(false, actualReturnedValue);
    }

    @Test
    public void number_divisible_by_20_returns_false(){
        // Arrange
        // Act
        boolean actualReturnedValue = testTarget.isLessThanMultipleOf20(40);
        // Assert
        Assert.assertEquals(false, actualReturnedValue);
    }

    @Test
    public void number_above_number_divisible_by_20_returns_false(){
        // Arrange
        // Act
        boolean actualReturnedValue = testTarget.isLessThanMultipleOf20(41);
        // Assert
        Assert.assertEquals(false, actualReturnedValue);
    }

    @Test
    public void neagtive_below_number_divisible_by_20_returns_true(){
        // Arrange
        // Act
        boolean actualReturnedValue = testTarget.isLessThanMultipleOf20(39);
        // Assert
        Assert.assertEquals(true, actualReturnedValue);
    }

    @Test
    public void number_below_20_returns_false(){
        // Arrange
        // Act
        boolean actualReturnedValue = testTarget.isLessThanMultipleOf20(10);
        // Assert
        Assert.assertEquals(false, actualReturnedValue);
    }




}
