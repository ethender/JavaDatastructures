package com.datastructures.arrays;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i,map.getOrDefault(i, 0) + 1);
        }


        int[] result = new int[k];

        for(int i = 0;i< k;i++){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for(int key: map.keySet()){
                if(map.get(key) > max){
                    max = Math.max(map.get(key), max);
                    index = key;
                }
            }
            result[i] = index;
            map.remove(index);
        }

        return result;
    }

}
