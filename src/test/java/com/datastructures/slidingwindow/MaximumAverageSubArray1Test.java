package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumAverageSubArray1Test {


    private static MaximumAverageSubArray1 avg;


    @BeforeAll
    public static void beforTest(){
        avg = new MaximumAverageSubArray1();
    }


    @Test
    public void test1(){
        int[] nums1 = new int[]{1,12,-5,-6,50,3};
       int k = 4;

       assertEquals(avg.findMaxAverage(nums1,k),12.75000);
    }

    @Test
    public void test2(){
        int[] nums1 = new int[]{5};
        int k = 1;

        assertEquals(avg.findMaxAverage(nums1,k),5.00000);
    }



}
