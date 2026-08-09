package com.datastructures.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumSubQueriesTest {


    private RangeSumQuery rangeSumQuery;

    @Test
    public void test1(){

        int[] nums = {-2, 0, 3, -5, 2, -1};
        rangeSumQuery = new RangeSumQuery(nums);

        int sum = rangeSumQuery.sumRange(0, 2);
        assertEquals(1, sum,"Expected 1 but got "+sum);
    }

    @Test
    public void test2(){

        int[] nums = {-2, 0, 3, -5, 2, -1};
        rangeSumQuery = new RangeSumQuery(nums);

        int sum = rangeSumQuery.sumRange(2, 5);
        assertEquals(-1, sum,"Expected -1 but got "+sum);
    }

    @Test
    public void test3(){

        int[] nums = {-2, 0, 3, -5, 2, -1};
        rangeSumQuery = new RangeSumQuery(nums);

        int sum = rangeSumQuery.sumRange(0, 5);
        assertEquals(-3, sum,"Expected -1 but got "+sum);
    }

}
