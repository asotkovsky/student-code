package com.techelevator;

import org.junit.*;

public class StringBitsTest {

    /*
    Test to complete:
    null = ""
    empty string = ""
    ABC = AC
    A = A
    AB = A

     */

    private StringBits testTarget;

    @Before
    public void setup() {
        testTarget = new StringBits();
    }

    @Test
    public void null_string(){
        String actualResult = testTarget.getBits(null);
        Assert.assertEquals("", actualResult);
    }

    @Test
    public void empty_string(){
        String actualResult = testTarget.getBits("");
        Assert.assertEquals("", actualResult);
    }

    @Test
    public void three_letter_string(){
        String actualResult = testTarget.getBits("abc");
        Assert.assertEquals("ac", actualResult);
    }

    @Test
    public void two_letter_string(){
        String actualResult = testTarget.getBits("ab");
        Assert.assertEquals("a", actualResult);
    }

    @Test
    public void single_character_string(){
        String actualResult = testTarget.getBits("a");
        Assert.assertEquals("a", actualResult);
    }


}
