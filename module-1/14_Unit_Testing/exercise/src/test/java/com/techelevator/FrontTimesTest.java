package com.techelevator;

import org.junit.*;

public class FrontTimesTest {

    /*
    Tests to complete:
    Empty string and negative int > ""
    Vanilla and negative int > ""
    Empty string and non-negative int > ""
    null > ""
    ab and 2 > abab
    abc and 2 > abcabc
    Chocolate and 3 > ChoChoCho


     */


    private FrontTimes testGenerateString;

    @Before
    public void setup(){
        testGenerateString = new FrontTimes();
    }

    @Test
    public void negative_int_returns_empty() {
        // Arrange
        // Act
        String stringWithNegativeInt = testGenerateString.generateString("Vanilla", -1);
        // Assert
        Assert.assertEquals("", stringWithNegativeInt);
    }

    @Test
    public void empty_returns_empty_string() {
        // Arrange
        // Act
        String actualStringReturned = testGenerateString.generateString("", 2);
        // Assert
        Assert.assertEquals("", actualStringReturned);
    }

    @Test
    public void null_returns_empty_string() {
        // Arrange
        // Act
        String actualReturnedString = testGenerateString.generateString(null, 1);
        // Assert
        Assert.assertEquals("", actualReturnedString);
    }

    @Test
    public void three_characters_returns_three_characters_repeated_n_times() {
        // Arrange
        // Act
        String actualReturnedString = testGenerateString.generateString("abc", 2);
        // Assert
        Assert.assertEquals("abcabc", actualReturnedString);

    }

    @Test
    public void two_characters_returns_two_characters_repeated_n_times() {
        // Arrange
        // Act
        String actualReturnedString = testGenerateString.generateString("ab", 2);
        // Assert
        Assert.assertEquals("abab", actualReturnedString);

    }

    @Test
    public void more_than_three_characters_returns_first_three_characters_repeated_n_times(){
        // Arrange
        // Act
        String actualReturnedString =  testGenerateString.generateString("Chocolate", 3);
        // Assert
        Assert.assertEquals("ChoChoCho", actualReturnedString);

    }


}
