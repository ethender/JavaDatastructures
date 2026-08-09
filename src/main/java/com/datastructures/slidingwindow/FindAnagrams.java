package com.datastructures.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int len = p.length();
        char[] sortedPArr = p.toCharArray();
        Arrays.sort(sortedPArr);

        for (int i = len; i <= s.length(); i++) {
            char[] sub =  s.substring(i-len, i).toCharArray();
            Arrays.sort(sub);
            if(Arrays.equals(sub, sortedPArr)) result.add(i-len);
        }
        return result;
    }
}
