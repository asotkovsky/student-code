package com.techelevator;

import org.junit.*;

public class DateFashionTest {

    /*
    Tests to write:
    (2,10) > 0
    (3, 10) > 2
    (2,2) > 0
    (2,0) > 0
    (5,5) > 1
    (1,1) > 0
     */

    private DateFashion tableTest;

    @Before
    public void setup(){
        tableTest = new DateFashion();
    }

    @Test
    public void two_and_very_stylish_returns_no(){
        // Arrange
        // Act
        int you2ThemExcellent = tableTest.getATable(2,10);
        // Assert
        Assert.assertEquals(0, you2ThemExcellent);
    }

    @Test
    public void two_and_two_returns_no(){
        // Arrange
        // Act
        int didTheyGetATable = tableTest.getATable(2,2);
        // Assert
        Assert.assertEquals(0, didTheyGetATable);
    }

    @Test
    public void above_two_and_excellent_returns_yes(){
        // Arrange
        // Act
        int youAbove2ThemExcellent = tableTest.getATable(3,10);
        Assert.assertEquals(2, youAbove2ThemExcellent);
    }

    @Test
    public void both_two_or_below_returns_no(){
        // Arrange
        // Act
        int you2ThemZero = tableTest.getATable(2,0);
        // Assert
        Assert.assertEquals(0, you2ThemZero);
    }

    @Test
    public void both_above_two_returns_maybe(){
        // Arrange
        // Act
        int didTheyGetATable = tableTest.getATable(5,5);
        // Assert
        Assert.assertEquals(1, didTheyGetATable);
    }

    @Test
    public void both_negative_returns_no(){
        // Arrange
        // Act
        int didTheyGetATable = tableTest.getATable(-1,-1);
        // Assert
        Assert.assertEquals(0, didTheyGetATable);
    }

}
