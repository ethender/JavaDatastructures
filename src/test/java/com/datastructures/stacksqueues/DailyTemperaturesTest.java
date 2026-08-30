package com.datastructures.stacksqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DailyTemperaturesTest {


    private DailyTemperatures dailyTemperatures;

    @BeforeEach
    public void init(){
        dailyTemperatures = new DailyTemperatures();
    }


    @Test
    public void test1(){
        int[] input  = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};

        int[] actual = dailyTemperatures.dailyTemperatures(input);

        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }

    @Test
    public void test2(){
        int[] input  = {30,40,50,60};
        int[] expected = {1,1,1,0};

        int[] actual = dailyTemperatures.dailyTemperatures(input);

        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }

    @Test
    public void test3(){
        int[] input  = {30,60,90};
        int[] expected = {1,1,0};

        int[] actual = dailyTemperatures.dailyTemperatures(input);

        assertArrayEquals(expected,actual,"Expected "+ Arrays.toString(expected)+" but got "+Arrays.toString(actual));
    }



}
