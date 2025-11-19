package com.datastructures.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length;i++){
            // If target is turned positive means all sum be positive due to sort.
            if(nums[i] > 0 ){
                break;
            }

            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }

            List<List<Integer>> triplet = find_triplet(nums,i+1,-nums[i]);
            if(!triplet.isEmpty()){
                for(List<Integer> list: triplet){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.addAll(list);
                    ans.add(temp);
                }
            }
        }

        return ans;
    }


    public List<List<Integer>> find_triplet(int[] nums, int start, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int left = start;
        int right = nums.length-1;

        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[left]);
                temp.add(nums[right]);
                ans.add(temp);
                left+=1;
                while(left<right && nums[left]==nums[left-1]){
                    left+=1;
                }
            }else if(sum < target){
                // as nums sorted we can do based on sum.
                left++;
            }else{
                right--;
            }

        }

        return ans;
    }


}
