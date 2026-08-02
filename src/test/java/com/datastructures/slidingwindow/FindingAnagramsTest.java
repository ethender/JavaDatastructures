package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingAnagramsTest {

    private FindAnagrams anagrams;


    @BeforeEach
    public void beforeEach(){
        anagrams = new FindAnagrams();
    }


    @Test
    public void test1(){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = anagrams.findAnagrams(s, p);
        List<Integer> expected = List.of(0,6);
        assertEquals(expected, result);
    }

    @Test
    public void test2(){
        String s = "abab";
        String p = "ab";
        List<Integer> result = anagrams.findAnagrams(s, p);
        List<Integer> expected = List.of(0,1,2);
        assertEquals(expected, result);
    }
}
