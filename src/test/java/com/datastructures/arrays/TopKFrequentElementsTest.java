package com.datastructures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import static org.assertj.core.api.Assertions.assertThat;
public class TopKFrequentElementsTest {


    private TopKFrequentElements topKFrequentElements;

    @BeforeEach
    public void init() {
        topKFrequentElements = new TopKFrequentElements();
    }

    @Test
    public void test1(){

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int[] expected  = {1,2};
        int[] actual = topKFrequentElements.topKFrequent(nums, k);
        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }

    @Test
    public void test2(){

        int[] nums = {1};
        int k = 1;

        int[] expected  = {1};
        int[] actual = topKFrequentElements.topKFrequent(nums, k);
        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }

    @Test
    public void test3(){

        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        int[] expected  = {1,2};
        int[] actual = topKFrequentElements.topKFrequent(nums, k);
        //assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
        assertThat(actual).containsExactlyInAnyOrder(expected);
    }


    @Test
    public void test4(){

        int[] nums = {1,2};
        int k = 2;

        int[] expected  = {1,2};
        int[] actual = topKFrequentElements.topKFrequent(nums, k);

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }


}
