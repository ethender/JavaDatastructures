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
}
