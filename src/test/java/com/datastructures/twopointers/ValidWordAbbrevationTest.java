package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidWordAbbrevationTest {


    private ValidWordAbbreviation validWordAbbrevation;

    @BeforeEach
    public void init(){
        validWordAbbrevation = new ValidWordAbbreviation();
    }

    @Test
    public void test1(){
        String word = "internationalization";
        String abbr = "i12iz4n";

        boolean expected = true;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }


    @Test
    public void test2(){
        String word = "apple";
        String abbr = "a2e";

        boolean expected = false;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }

    @Test
    public void test3(){
        String word = "substitution";
        String abbr = "sub4u4";

        boolean expected = true;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }

    @Test
    public void test4(){
        String word = "substitution";
        String abbr = "12";

        boolean expected = true;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }

    @Test
    public void test5(){
        String word = "abbde";
        String abbr = "a1b01e";

        boolean expected = false;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }


    @Test
    public void test6(){
        String word = "a";
        String abbr = "2";

        boolean expected = false;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }

    @Test
    public void test7(){
        String word = "hi";
        String abbr = "hi1";

        boolean expected = false;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }

    @Test
    public void test8(){
        String word = "hi";
        String abbr = "1";vb

        boolean expected = false;
        boolean actual = validWordAbbrevation.validWordAbbreviation(word, abbr);
        assertEquals(expected,actual,"Expected :"+expected+" actual :"+actual);
    }
}
