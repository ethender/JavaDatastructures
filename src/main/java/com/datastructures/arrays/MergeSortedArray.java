package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray {


    /**
     *  Using Two Pointers techinque to solve this issue. merging two sorted values
     * @param nums1
     * @param nums2
     * @return result
     */
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

        if(nums1.isEmpty()) return nums2;

        if(nums2.isEmpty()) return nums1;

        ArrayList<Integer> result = new ArrayList<>();
        int first =0;
        int second = 0;

        while(first<nums1.size() && second<nums2.size()){
            if(nums1.get(first) < nums2.get(second)){
                result.add(nums1.get(first));
                first++;
            }else if(nums1.get(first) > nums2.get(second)){
                result.add(nums2.get(second));
                second++;
            }else if(nums1.get(first) == nums2.get(second)){
                result.add(nums1.get(first));
                result.add(nums2.get(second));
                first++;
                second++;
            }
        }

        if(first < nums1.size()){
            result.addAll(nums1.subList(first,nums1.size()));
        }

        if(second < nums2.size()){
            result.addAll(nums2.subList(second,nums2.size()));
        }


        return result;

    }


    public static void main(String[] args){
        /**ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        Collections.addAll(first, 1,2,3);
        Collections.addAll(second, 4,5,6);**/

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        Collections.addAll(first, -1,3);
        Collections.addAll(second, -1,-1,0,0,1,2);

        System.out.println(mergeArrays(first,second));

    }

}
