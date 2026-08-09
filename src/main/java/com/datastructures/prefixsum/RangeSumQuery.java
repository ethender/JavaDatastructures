package com.datastructures.prefixsum;

public class RangeSumQuery {

    private int[] nums;

    public RangeSumQuery(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if(left == 0){
            return nums[right];
        }

        return nums[right]-nums[left-1];
    }
}
