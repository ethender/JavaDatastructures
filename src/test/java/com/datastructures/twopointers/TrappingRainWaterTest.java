package com.datastructures.twopointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private static TrappingRainWater rainWater;


    @BeforeAll
    public static void init(){
        rainWater = new TrappingRainWater();
    }

    @Test
    public void test1(){
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(rainWater.trap(nums),6);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{4,2,0,3,2,5};
        assertEquals(rainWater.trap(nums),9);
    }


}
