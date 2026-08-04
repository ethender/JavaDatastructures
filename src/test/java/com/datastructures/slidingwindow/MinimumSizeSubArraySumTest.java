package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSizeSubArraySumTest {

    private MinimumSizeSubArraySum minimumSizeSubArraySum;


    @BeforeEach
    public void beforeEach(){
        minimumSizeSubArraySum = new MinimumSizeSubArraySum();
    }


    @Test
    public void test1(){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int expected = 2;
        assertEquals(expected, minimumSizeSubArraySum.minSubArrayLen(target, nums));
    }

    @Test
    public void test2(){
        int target = 4;
        int[] nums = {1,4,4};
        int expected = 1;
        assertEquals(expected, minimumSizeSubArraySum.minSubArrayLen(target, nums));
    }
}
