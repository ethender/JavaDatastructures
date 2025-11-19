package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {


    private static MergeSortedArray sortedArray;


    @BeforeAll
    public static void beforTest(){
        sortedArray = new MergeSortedArray();
    }


    @Test
    public void test1(){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        sortedArray.merge(nums1,m,nums2,n);
        int[] result = new int[]{1,2,2,3,5,6};
        assertArrayEquals( nums1,result);
    }

    @Test
    public void test2(){
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;
        sortedArray.merge(nums1,m,nums2,n);
        int[] result = new int[]{1};
        assertArrayEquals( nums1,result);
    }

    @Test
    public void test3(){
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        sortedArray.merge(nums1,m,nums2,n);
        int[] result = new int[]{1};
        assertArrayEquals( nums1,result);
    }

}
