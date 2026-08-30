package com.datastructures.stacksqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PreviousSmallerTest {



    private PreviousSmallerElement previousSmaller;

    @BeforeEach
    public void init(){
        previousSmaller = new PreviousSmallerElement();
    }

    @Test
    public void test1(){
        int[] nums = {2, 1, 5, 6, 2, 3};
        int[] expected = {5, 5, 6, -1, 3, -1};
        int[] actual = previousSmaller.previousSmallerElement(nums);
        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }



}
