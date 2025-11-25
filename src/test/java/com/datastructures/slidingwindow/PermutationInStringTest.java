package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PermutationInStringTest {


    private static PermutationInString per;


    @BeforeAll
    public static void beforTest(){
        per = new PermutationInString();
    }


    @Test
    public void test1(){
        String s1 = "ab";
        String s2 = "a";

       assertEquals(false,per.checkInclusion(s1,s2));
    }

    @Test
    public void test2(){
        String s1 = "ab";
        String s2 = "eidbaooo";

        assertEquals(true,per.checkInclusion(s1,s2));
    }

    @Test
    public void test3(){
        String s1 = "ab";
        String s2 = "eidboaoo";

        assertEquals(false,per.checkInclusion(s1,s2));
    }





}
