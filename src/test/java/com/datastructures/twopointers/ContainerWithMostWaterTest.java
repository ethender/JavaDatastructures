package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {

    private static ContainerWithMostWater container;

    @BeforeAll
    public static void initialise(){
        container = new ContainerWithMostWater();
    }

    @Test
    public void test1(){
        int[] nums1 = new int[]{1,8,6,2,5,4,8,3,7};
        assertEquals(49,container.maxArea(nums1));
    }

    @Test
    public void test2(){
        int[] nums1 = new int[]{1,1};
        assertEquals(1,container.maxArea(nums1));
    }
}
