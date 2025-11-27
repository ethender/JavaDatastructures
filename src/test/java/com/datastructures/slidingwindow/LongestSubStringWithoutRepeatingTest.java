package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LongestSubStringWithoutRepeatingTest {


    private static LongestSubStringWithoutRepeating longest;


    @BeforeAll
    public static void beforTest(){
       longest = new LongestSubStringWithoutRepeating();
    }


    @Test
    public void test1(){
        String s = "abcabcbb";


       assertEquals(3, longest.lengthOfLongestSubstring(s));
    }


    @Test
    public void test2(){
        String s = "bbbbb";


        assertEquals(1, longest.lengthOfLongestSubstring(s));
    }


    @Test
    public void test3(){
        String s = "pwwkew";


        assertEquals(3, longest.lengthOfLongestSubstring(s));
    }




}
