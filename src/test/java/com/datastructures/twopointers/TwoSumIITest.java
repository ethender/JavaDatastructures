package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIITest {

    private static TwoSumII twoSum;


    @BeforeAll
    public static void intialise(){
        twoSum = new TwoSumII();
    }

    @Test
    public void test1(){
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        int[] result = new int[]{1,2};
        assertArrayEquals(twoSum.twoSum(numbers,target), result);
    }

    @Test
    public void test2(){
        int[] numbers = new int[]{2,3,4};
        int target = 6;

        int[] result = new int[]{1,3};
        assertArrayEquals(twoSum.twoSum(numbers,target), result);
    }

    @Test
    public void test3(){
        int[] numbers = new int[]{-1,0};
        int target = -1;

        int[] result = new int[]{1,2};
        assertArrayEquals(twoSum.twoSum(numbers,target), result);
    }


}
