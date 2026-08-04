package com.datastructures.slidingwindow;

public class MinimumSizeSubArraySum {


    public int minSubArrayLen(int target, int[] nums) {
        int result = nums.length+1;
        int left = 0;
        int curr = 0;
        for(int right=0;right<nums.length;right++){
            curr +=nums[right];
            while(curr >= target){
                result = Math.min(result,right-left+1);
                curr -= nums[left];
                left++;
            }
        }

        return result==nums.length+1?0:result;
    }
}
