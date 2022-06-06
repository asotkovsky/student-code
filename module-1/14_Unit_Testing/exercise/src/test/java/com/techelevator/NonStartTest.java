package com.techelevator;

import org.junit.*;

public class NonStartTest {

    /* Things to test
    - One character strings returns ""
    - "Hello", "There" > elloere
    - null returns > ""
    - empty string returns ""
     */

    private NonStart testTarget;

    @Before
    public void setup(){ testTarget = new NonStart(); }

    @Test
    public void one_character_string(){
        String test = testTarget.getPartialString("a", "b");
        Assert.assertEquals("", test);
    }

    @Test
    public void multi_character_string(){
        String test = testTarget.getPartialString("Hello", "There");
        Assert.assertEquals("ellohere", test);
    }

    @Test
    public void null_string(){
        String test = testTarget.getPartialString(null, null);
        Assert.assertEquals("", test);
    }

    @Test
    public void empty_string(){
        String test = testTarget.getPartialString("", "");
        Assert.assertEquals("", test);
    }

    
}
