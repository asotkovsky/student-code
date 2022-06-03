package com.techelevator;

import org.junit.*;

public class CigarPartyTest {

    private CigarParty testTarget;

    /*
    Tests to complete:
    - 40 cigars, is not weekend = successful
    - 60 cigars, is not weekend = successful
    - 50 cigars, is not weekend = successful
    - 0 cigars, is not weekend = false (not successful)
    - 0 cigars, is weekend = false (not successful)
    - 61 cigars, is not weekend = false (not successful)
    - 61 cigars, is weekend = successful
    - 40 cigars, is weekend = successful
     */

    @Before
    public void setup(){
        testTarget = new CigarParty();
    }

    @Test
    public void forty_cigars_is_not_weekend_returns_true(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(40, false);
        //Assert
        Assert.assertEquals(true, actualIsPartySuccessful);
    }

    @Test
    public void forty_cigars_is_weekend_returns_true(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(40, true);
        //Assert
        Assert.assertEquals(true, actualIsPartySuccessful);
    }

    @Test
    public void sixty_cigars_is_not_weekend_returns_true(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(60, false);
        //Assert
        Assert.assertEquals(true, actualIsPartySuccessful);
    }

    @Test
    public void fifty_cigars_is_not_weekend_returns_true(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(50, false);
        //Assert
        Assert.assertEquals(true, actualIsPartySuccessful);
    }

    @Test
    public void zero_cigars_is_not_weekend_returns_false(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(0, false);
        //Assert
        Assert.assertEquals(false, actualIsPartySuccessful);
    }

    @Test
    public void zero_cigars_is_weekend_returns_false(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(0, true);
        //Assert
        Assert.assertEquals(false , actualIsPartySuccessful);
    }

    @Test
    public void sixty_one_cigars_is_not_weekend_returns_false(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(61, false);
        //Assert
        Assert.assertEquals(false, actualIsPartySuccessful);
    }

    @Test
    public void sixty_one_cigars_is_weekend_returns_false(){
        //Arrange
        //Act
        boolean actualIsPartySuccessful = testTarget.haveParty(61, true);
        //Assert
        Assert.assertEquals(true, actualIsPartySuccessful);
    }





}

