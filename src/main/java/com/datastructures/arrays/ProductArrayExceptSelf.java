package com.datastructures.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static int[] findProduct_nsquare_runtime(int arr[]) {
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length;i++){
            int product = 1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product *= arr[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];

        int n = arr.length;
        int left =1;


        for(int i=0;i<n;i++){
            result[i] = left;
            left *=arr[i];
        }

        int right = 1;
        for(int i=n-1;i >=0;i--){
            result[i] *= right;
            right *= arr[i];
        }

        return result;
    }


    public static void main(String[] args){
        int[] arr = new int[]{2,4,0,6};

        System.out.println(Arrays.toString(findProduct(arr)));

    }
}
