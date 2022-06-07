package com.techelevator;

import org.junit.*;

/*
Scenarios to test:

estimatedTotal Calculation:

- Negative nights stay (edge case) >
- 0 nights stay (edge case) > 0;
- 3 nights stay (normal scenario) > 179.97

actualTotal Calculation:

- estimatedTotal = 119.98, requiresCleaning = true, usedMiniBar = true > $202.95
- estimatedTotal = 119.98, requiresCleaning = false, usedMiniBar = true > $132.97
- estimatedTotal = 119.98, requiresCleaning = true, usedMiniBar = false > $154.97
- estimatedTotal = 119.98, requiresCleaning = false, usedMiniBar = false > $119.98

 */

public class HotelReservationTest {

  private HotelReservation testTarget;

  @Before
  public void setup(){
      testTarget = new HotelReservation();
  }

//  @Test
//  public void estimatedTotal3Nights() {
//      double actualEstimate = testTarget.getEstimatedTotal(3);
//      Assert.assertEquals(179.77, actualEstimate, .0009);
//
//  }




}
