package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {


    private static ThreeSum threeSum;
    @BeforeAll
    public static void initialise(){
        threeSum = new ThreeSum();
    }

    @Test
    public void test1(){
        int[] nums = new int[]{-1,0,1,2,-1,-4};


        List<List<Integer>> res = threeSum.threeSum(nums);
        assertEquals(res.size(),2);

    }

    @Test
    public void test2(){
        int[] nums = new int[]{0,1,1};


        List<List<Integer>> res = threeSum.threeSum(nums);
        assertEquals(res.size(),0);

    }

    @Test
    public void test3(){
        int[] nums = new int[]{0,0,0};


        List<List<Integer>> res = threeSum.threeSum(nums);
        assertEquals(res.size(),1);

    }


}
