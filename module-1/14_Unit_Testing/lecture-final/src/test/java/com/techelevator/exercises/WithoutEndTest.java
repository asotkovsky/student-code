package com.techelevator.exercises;

import org.junit.*;

public class WithoutEndTest {

    /*
        Tests we should have:

        "" -> ""
       X abcabc -> bcab
        abc -> b
        ab -> ""
       X a -> ""
       X null -> ""

     */


    private WithoutEnd target;

    @Before
    public void setup() {
        target = new WithoutEnd();
    }

    @Test
    public void single_character_returns_empty_string() {
        // Arrange
        // Act
        String actualResult = target.withoutEnd("a");
        // Assert
            // assertEquals( expectedResult,  actualResult)
        Assert.assertEquals("", actualResult);
    }

    @Test
    public void first_and_last_characters_removed() {
        // Arrange
        // Act
        String actualResult = target.withoutEnd("abcabc");
        // Assert
        Assert.assertEquals("bcab", actualResult);
    }

    @Test
    public void null_returns_empty_string() {
        // Arrange
        // Act
        String actualResult = target.withoutEnd(null);
        Assert.assertEquals("", actualResult);
    }



}
