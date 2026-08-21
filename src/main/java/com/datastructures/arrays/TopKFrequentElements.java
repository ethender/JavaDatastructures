package com.datastructures.arrays;

import java.util.*;

public class TopKFrequentElements {

    class FreqElements implements Comparator<Integer> {

        int element;
        int count;
        public FreqElements(int element, int count) {
            this.element = element;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        int[] result = new int[k];

        for(int i = 0;i< k;i++){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for(int key: map.keySet()){
                if(map.get(key) > max){
                    max = Math.max(map.get(key), max);
                    index = key;
                };
            }
            result[i] = index;
            map.remove(index);
        }

        return result;
    }

}
