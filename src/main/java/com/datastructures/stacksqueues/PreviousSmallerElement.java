package com.datastructures.stacksqueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PreviousSmallerElement {


    public int[] previousSmallerElement(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);

        for(int i = 0; i < nums.length; i++){

            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                res[i] = stack.peek();
            }
            stack.push(i);
        }

        return res;
    }

}
