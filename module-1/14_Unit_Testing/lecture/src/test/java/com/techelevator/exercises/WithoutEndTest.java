package com.techelevator.exercises;

import org.junit.*;

public class WithoutEndTest {

    /*


    Tests we should have:

    "" returns ""
    String with 2 letters returns ""
    abcabc --> bcab
    String with one letter returns ""
    Test null - > ""
    abc -> "b"


     */

    private WithoutEnd testTarget;

    @Before
    public void setup(){
        testTarget = new WithoutEnd();
    }

    @Test
    public void single_character_returns_empty_sting(){
        // Arrange
        // Act
        String actualResult = testTarget.withoutEnd("a");
        Assert.assertEquals("", actualResult);
    }

    @Test
    public void empty_string_returns_empty_string(){
        // Arrange
        // Act
        String actualResult = testTarget.withoutEnd("");
        // Assert
        Assert.assertEquals("", actualResult);
    }

    @Test
    public void first_and_last_characters_removed(){
        // Arrange
        // Act
        String actualResult = testTarget.withoutEnd("abcabc");
        // Assert
        Assert.assertEquals("bcab", actualResult);
    }

    @Test
    public void null_returns_empty_sting(){
        // Arrange
        // Act
        String actualResult = testTarget.withoutEnd(null);
        // Assert
        Assert.assertEquals("", actualResult);
    }


}
