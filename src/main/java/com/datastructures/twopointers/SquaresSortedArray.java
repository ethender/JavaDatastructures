package com.datastructures.twopointers;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length-1;

        for(int pos=nums.length-1;pos>=0;pos--){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare>rightSquare){
                result[pos]=leftSquare;
                left++;
            }else{
                result[pos]=rightSquare;
                right--;
            }
        }

        return result;
    }


}
