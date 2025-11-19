package com.datastructures.twopointers;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxWater = 0;

        int left = 0;
        int right = height.length-1;
        while(left < right){
            int minHeight = Math.min(height[left],height[right]);
            int max = minHeight*(right-left);

            maxWater = Math.max(maxWater, max);

            if(height[right] < height[left]){
                right--;
            }else{
                left++;
            }

        }

        return maxWater;

    }
}
