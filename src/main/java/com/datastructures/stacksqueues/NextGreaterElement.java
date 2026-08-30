package com.datastructures.stacksqueues;

import java.util.Arrays;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);

        for(int i = 0; i < nums.length; i++){


            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                int index = stack.pop();
                res[index] = nums[i];
            }
            stack.push(i);
        }

        return res;
    }
}
