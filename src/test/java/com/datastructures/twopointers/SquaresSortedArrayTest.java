package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresSortedArrayTest {


    public SquaresSortedArray sortedArray;

    @BeforeEach
    public  void init(){
        sortedArray = new SquaresSortedArray();
    }


    @Test
    public void test1(){
        int[] nums1 = new int[]{-4,-1,0,3,10};

       int[] actual =  sortedArray.sortedSquares(nums1);
        int[] expected = new int[]{0,1,9,16,100};
        assertArrayEquals( actual,expected," Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }

    @Test
    public void test2(){
        int[] nums1 = new int[]{-7,-3,2,3,11};

        int[] actual =  sortedArray.sortedSquares(nums1);
        int[] expected = new int[]{4,9,9,49,121};
        assertArrayEquals( actual,expected," Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }


}
