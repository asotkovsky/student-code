package com.techelevator;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    /*
    Things to test:
    single string in array, "ba" returns "ba": 1
    empty array returns empty map
    null returns empty map
    ["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1
     */

    private WordCount testTarget;

    @Before
    public void setup(){
        testTarget = new WordCount();
    }

    @Test
    public void single_string_in_array(){
        String[] testStringArray = new String[] { "ba" };
        Map<String, Integer> actualReturnedMap = new HashMap<String, Integer>(testTarget.getCount(testStringArray));
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("ba", 1 );
        Assert.assertEquals(expectedMap, actualReturnedMap);

    }

    @Test
    public void empty_array(){
        String[] testStringArray = new String[] {  };
        Map<String, Integer> actualReturnedMap = new HashMap<String, Integer>(testTarget.getCount(testStringArray));
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        Assert.assertEquals(expectedMap, actualReturnedMap);

    }

    @Test
    public void array_with_null_value_only(){
        String[] testStringArray = new String[] { null };
        Map<String, Integer> actualReturnedMap = new HashMap<String, Integer>(testTarget.getCount(testStringArray));
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put( null, 1 );
        Assert.assertEquals(expectedMap, actualReturnedMap);

    }

    @Test
    public void multi_string_array_with_repeats(){
        String[] testStringArray = new String[] { "ba", "ba", "black", "sheep" };
        Map<String, Integer> actualReturnedMap = new HashMap<String, Integer>(testTarget.getCount(testStringArray));
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("ba", 2 );
        expectedMap.put("black", 1 );
        expectedMap.put("sheep", 1 );
        Assert.assertEquals(expectedMap, actualReturnedMap);

    }

    @Test
    public void array_with_null_and_regular_string_values(){
        String[] testStringArray = new String[] { null, "ba", "ba", "black", "sheep" };
        Map<String, Integer> actualReturnedMap = new HashMap<String, Integer>(testTarget.getCount(testStringArray));
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put( null, 1);
        expectedMap.put("ba", 2 );
        expectedMap.put("black", 1 );
        expectedMap.put("sheep", 1 );
        Assert.assertEquals(expectedMap, actualReturnedMap);

    }

}
