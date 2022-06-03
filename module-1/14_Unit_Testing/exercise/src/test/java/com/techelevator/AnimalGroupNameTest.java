package com.techelevator;

import org.junit.*;

public class AnimalGroupNameTest {

    /*
    What tests to build:
    null -> unknown
    "" -> unknown
    Rhino -> Crash
    rHINo -> Crash
    wolf -> unknown

     */

    private AnimalGroupName animalGroupName;

    @Before
    public void setup() {
        animalGroupName = new AnimalGroupName();
    }

    @Test
    public void animal_in_map_returns_corresponding_herd(){
        //Arrange
        //Act
       String actualHerd = animalGroupName.getHerd("Rhino");
       Assert.assertEquals("Animal and herd name match!","Crash", actualHerd);
    }

    @Test
    public void mixed_case_animal_returns_corresponding_herd(){
        //Arrange
        //Act
        String actualHerd = animalGroupName.getHerd("rHINo");
        Assert.assertEquals("Animal and herd name match!","Crash", actualHerd);
    }

    @Test
    public void animal_not_in_map_returns_unknown(){
        //Arrange
        //Act
        String actualHerd = animalGroupName.getHerd("wolf");
        Assert.assertEquals("Animal not in map returns unknown!","unknown", actualHerd);
    }

    @Test
    public void null_returns_unknown(){
        //Arrange
        //Act
        String actualHerd = animalGroupName.getHerd(null);
        Assert.assertEquals("Null returns unknown!","unknown", actualHerd);
    }

    @Test
    public void empty_string_returns_unknown(){
        //Arrange
        //Act
        String actualHerd = animalGroupName.getHerd("wolf");
        Assert.assertEquals("Animal not in map returns unknown!","unknown", actualHerd);
    }


}
