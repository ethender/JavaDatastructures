package com.datastructures.advance.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {


    public Power power;

    @BeforeEach
    public void setUp() {
        power = new Power();
    }


    @Test
    public void test1() {
        double x = 2.0;
        int n = 10;
        double expected = 1024.00000;
        double actual =  power.myPow(x, n);
        assertEquals(actual,expected,0.001,"Expected "+expected+" but got "+actual);
    }


    @Test
    public void test2() {
        double x = 2.10000;
        int n = 3;
        double expected = 9.26100;
        double actual =  power.myPow(x, n);
        assertEquals(actual,expected,0.001,"Expected "+expected+" but got "+actual);
    }

    @Test
    public void test3() {
        double x = 2.00000;
        int n = -2;
        double expected = 0.25000;
        double actual =  power.myPow(x, n);
        assertEquals(actual,expected,0.001,"Expected "+expected+" but got "+actual);
    }
}
