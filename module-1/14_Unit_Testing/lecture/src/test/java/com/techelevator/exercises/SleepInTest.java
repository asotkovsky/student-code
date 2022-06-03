package com.techelevator.exercises;

import org.junit.*;

public class SleepInTest {

    private SleepIn testTarget;

    @Before
    public void setup(){
        testTarget = new SleepIn();
    }

    @Test
    public void sleepin_when_not_a_weekday_and_not_on_vacation(){
        // Arrange (Setup)
        //Act (Test)
        boolean actualResult = testTarget.willSleepIn(false, false);
        // Assert (Verify
        Assert.assertTrue(actualResult);
    }

    @After
    public void cleanup(){
        System.out.println("The after has ran!");
    }

    // Only need after method if you need clean up after every test.
    // It is common not to need or include @After

    @Test
    public void sleepin_when_is_a_weekday_and_is_on_vacation(){
        //Arrange (setup)
        //Act (test)
        boolean actualResult = testTarget.willSleepIn(true, true);
        //Assert (verify)
        Assert.assertTrue(actualResult);
    }

    @Test
    public void dont_sleep_in_when_weekday_and_not_on_vacation(){
        //Arrange (setup)
        //Act (test)
        boolean actualResult = testTarget.willSleepIn(true, false);
        //Assert (verify)
        Assert.assertFalse(actualResult);
    }

    @Test
    public void sleepin_when_is_not_weekday_and_on_vacation(){
        //Arrange (setup)
        //Act (test)
        boolean actualResult = testTarget.willSleepIn(false, true);
        //Assert (verify)
        Assert.assertTrue(actualResult);
    }

}