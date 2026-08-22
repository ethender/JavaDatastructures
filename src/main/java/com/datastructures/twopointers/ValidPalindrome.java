package com.datastructures.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);

            if(!Character.isDigit(lChar) && !Character.isLetter(lChar)){
                left++;
            }else if(!Character.isDigit(rChar) && !Character.isLetter(rChar)){
                right--;
            }else{
                if(Character.toLowerCase(lChar) != Character.toLowerCase(rChar)){
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
