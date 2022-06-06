package com.techelevator;

import org.junit.*;

public class AnimalGroupNameTest {

    private AnimalGroupName animalGroupName;

    @Before
    public void setup() {
        animalGroupName = new AnimalGroupName();
    }

    /*
        This we might test

        Rhino -> Crash
        rHiNo -> Crash
        penguin -> "unknown"
        null -> "unknown"
        "" -> "unknown"
        "elephants" -> "unknown" ??

     */

    @Test
    public void correct_herd_returned_for_animal() {
        // Arrange
        // Act
        String actualHerd = animalGroupName.getHerd("Rhino");
        // Assert
        Assert.assertEquals("Crash", actualHerd);
    }



}
