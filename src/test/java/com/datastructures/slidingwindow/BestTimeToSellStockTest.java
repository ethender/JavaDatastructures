package com.datastructures.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToSellStockTest {


    private  BestTimeToSellStock bestTimeToSellStock;


    @BeforeEach
    public void beforeEach(){
        bestTimeToSellStock = new BestTimeToSellStock();
    }

    @Test
    public void test1(){
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int actual = bestTimeToSellStock.maxProfit(prices);
        assertEquals(actual, expected,"Expected "+expected+" but got "+actual);
    }


    @Test
    public void test2(){
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int actual = bestTimeToSellStock.maxProfit(prices);
        assertEquals(actual, expected,"Expected "+expected+" but got "+actual);
    }
}
