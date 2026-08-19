package com.datastructures.advance.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestSwapPairs {


    private SwapNodesInPairs swapNodesInPairs;

    @BeforeEach
    public void initialse(){
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @Test
    public void test1(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);

        List<Integer> expected = List.of(2,1,4,3,5);

        ListNode returned = swapNodesInPairs.swapPairs(first);

        List<Integer> actual = new ArrayList<>();
       ListNode curr = returned;

       while(curr != null){
           actual.add(curr.getVal());
           curr = curr.getNext();
       }

       assertEquals(expected, actual,"Expected: "+ Arrays.toString(expected.toArray())+" Actual: "+Arrays.toString(actual.toArray()));
    }

    @Test
    public void test2(){


        ListNode returned = swapNodesInPairs.swapPairs(null);



        assertNull(returned,"Expected: null");
    }

    @Test
    public void test3(){
        ListNode first = new ListNode(1);


        List<Integer> expected = List.of(1);

        ListNode returned = swapNodesInPairs.swapPairs(first);

        List<Integer> actual = new ArrayList<>();
        ListNode curr = returned;

        while(curr != null){
            actual.add(curr.getVal());
            curr = curr.getNext();
        }

        assertEquals(expected, actual,"Expected: "+ Arrays.toString(expected.toArray())+" Actual: "+Arrays.toString(actual.toArray()));
    }
}
