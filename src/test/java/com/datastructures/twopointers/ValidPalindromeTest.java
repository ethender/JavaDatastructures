package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {


    private ValidPalindrome validPalindrome;

    @BeforeEach
    public  void initialise(){
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void test1(){
        String s = "A man, a plan, a canal: Panama";


        boolean actual = validPalindrome.isPalindrome(s);
        boolean expected = true;
        assertEquals(actual,expected,"Expect "+expected+" But got "+actual);

    }

    @Test
    public void test2(){
        String s = "race a car";


        boolean actual = validPalindrome.isPalindrome(s);
        boolean expected = false;
        assertEquals(actual,expected,"Expect "+expected+" But got "+actual);

    }

    @Test
    public void test3(){
        String s = " ";


        boolean actual = validPalindrome.isPalindrome(s);
        boolean expected = true;
        assertEquals(actual,expected,"Expect "+expected+" But got "+actual);

    }


}
