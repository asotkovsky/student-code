package com.techelevator.exercises;

import org.junit.*;

public class SleepInTest {

    private SleepIn testTarget;

    @Before
    public void setup() {
        testTarget = new SleepIn();
    }

    /*
        Only need an @After method if you need to do cleanup
        after every test.  It is common not to need or include @After
     */
    @After
    public void cleanup() {
        System.out.println("Running After...");
    }

    @Test
    public void sleepin_when_not_a_weekday_and_not_on_vacation() {
        // Arrange (Setup)
        // Act (Test)
        boolean actualResult = testTarget.willSleepIn(false, false);
        // Assert (Verify)
        Assert.assertTrue(actualResult);
    }

    @Test
    public void sleepin_when_weekday_and_on_vacation() {
        // Arrange
        // Act
        boolean actualResult = testTarget.willSleepIn(true, true);
        // Assert
        Assert.assertTrue(actualResult);
    }

    @Test
    public void dont_sleepin_when_weekday_and_not_on_vacation() {
        // Arrange
        // Act
        boolean actualResult = testTarget.willSleepIn(true, false);
        // Assert
        Assert.assertFalse(actualResult);
    }

    @Test
    public void sleepin_when_weekend_and_on_vacation() {
        // Arrange
        // Act
        boolean actualResult = testTarget.willSleepIn(false, true);
        // Assert
        Assert.assertTrue(actualResult);
    }
}
