package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringAlternativelyTest {


    private MergeStringsAlternatively mergeStringsAlternatively;;

    @BeforeEach
    public void init(){
        mergeStringsAlternatively = new MergeStringsAlternatively();
    }

    @Test
    public void test1(){
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String actual = mergeStringsAlternatively.mergeAlternately(word1, word2);
        assertEquals(actual, expected,"Expected "+expected+" but got "+actual);
    }

    @Test
    public void test2(){
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        String actual = mergeStringsAlternatively.mergeAlternately(word1, word2);
        assertEquals(actual, expected,"Expected "+expected+" but got "+actual);
    }

    @Test
    public void test3(){
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        String actual = mergeStringsAlternatively.mergeAlternately(word1, word2);
        assertEquals(actual, expected,"Expected "+expected+" but got "+actual);
    }
}
