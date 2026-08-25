package com.datastructures.stacksqueues;

import com.datastructures.slidingwindow.BestTimeToSellStock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {



    @Test
    public void test1(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3,minStack.getMin(),"Expected -3 but got "+minStack.getMin());
        minStack.pop();
        assertEquals(0,minStack.top(),"Expected 0 but got "+minStack.top());    // return 0
        assertEquals(-2,minStack.getMin(),"Expected -2 but got "+minStack.getMin()); // return -2
    }



}
