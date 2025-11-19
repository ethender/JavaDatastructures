package com.datastructures.twopointers;

public class TrappingRainWater {

    public int trap(int[] height) {


        if(height == null || height.length == 0) return 0;

        // Initialsing two pointers
        int left = 0;
        int right = height.length-1;
        // Assigning max end values
        int leftMax = height[left];
        int rightMax = height[right];

        int ans = 0;

        while(left< right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                ans += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                ans+= rightMax - height[right];
            }
        }

        return ans;
    }
}
