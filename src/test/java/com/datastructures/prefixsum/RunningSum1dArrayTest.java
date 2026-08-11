package com.datastructures.prefixsum;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunningSum1dArrayTest {


    private RunningSum1dArray runningSum1dArray;

    @BeforeEach
    public void initialse(){
        runningSum1dArray = new RunningSum1dArray();
    }

    @Test
    public void test1(){

        int[] nums = {1,2,3,4};
        int[] expected  = {1,3,6,10};
        int[] returned  = runningSum1dArray.runningSum(nums);
        assertArrayEquals(expected,returned,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(returned));
    }

    @Test
    public void test2(){

        int[] nums = {1,1,1,1,1};
        int[] expected  = {1,2,3,4,5};
        int[] returned  = runningSum1dArray.runningSum(nums);
        assertArrayEquals(expected,returned,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(returned));
    }

    @Test
    public void test3(){

        int[] nums = {3,1,2,10,1};
        int[] expected  = {3,4,6,16,17};
        int[] returned  = runningSum1dArray.runningSum(nums);
        assertArrayEquals(expected,returned,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(returned));
    }



}
