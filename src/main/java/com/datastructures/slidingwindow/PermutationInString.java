package com.datastructures.slidingwindow;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkPer(char[] per, String s){
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        return Arrays.equals(per,s1);
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        char[] per = s1.toCharArray();
        String check = s2;

        Arrays.sort(per);
        int left = 0;
        int right = per.length;

        while(right <= check.length()){
            if(checkPer(per,check.substring(left,right))) return true;

            left++;
            right++;
        }

        return false;
    }
}
