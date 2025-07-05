package com.datastructures.arrays;

import java.util.Arrays;

public class FindTwoIntegers {

    public static void main(String[] args){
        int[] test = new int[] {1,10,8,4,9};
        System.out.println(Arrays.toString(findSum(test,17)));
    }


    public static int[] findSum(int[] arr, int n) {
        Arrays.sort(arr);
        int[] result = new int[2];

        int left=0;
        int right =arr.length-1;

        while(left<right){
            int sum  = (arr[left]+arr[right]);
            if(sum==n){
                result[0] = arr[left];
                result[1] =arr[right];
                break;
            }else if(sum < n){
                left++;
            }else if(sum > n){
                right--;
            }
        }

        return result;
    }
}
