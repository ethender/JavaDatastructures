package com.datastructures.arrays;

import java.util.Arrays;

public class RemoveEven {

    public static int[] removeEven(int[] arr) {

        int oddLength = 0;

        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2 !=0){
                oddLength++;
            }
        }

        int[] result = new int[oddLength];
        int pos=0;
       for(int i =0; i < arr.length;i++){
           if(arr[i]%2!=0){
                result[pos] = arr[i];
                pos++;
           }
       }
        return result;
    }


    public static void main(String[] args){
        int[] result = new int[] {0,20,41};
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(removeEven(result)));
    }



}
