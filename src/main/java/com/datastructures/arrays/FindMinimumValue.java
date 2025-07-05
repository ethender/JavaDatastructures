package com.datastructures.arrays;

import java.util.Arrays;

public class FindMinimumValue {


    public static int findMinimum_old(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int findMinimum(int[] arr) {
        int result = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            result = Math.min(result, arr[i]);
        }

        return result;
    }



    public static void main(String[] args){
        int[] arr = new int[]{1,2,-3,-1,-2};

        System.out.println(findMinimum(arr));

    }
}
