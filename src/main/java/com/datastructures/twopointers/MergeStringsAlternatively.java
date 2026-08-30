package com.datastructures.twopointers;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        int left =  0;
        int right = 0;
        boolean isLeft = true;
        StringBuilder sb = new StringBuilder();

        // appending left and right;
        while (left < word1.length() && right < word2.length()) {
            if(isLeft) {
                sb.append(word1.charAt(left));
                left++;
            }else{
                sb.append(word2.charAt(right));
                right++;
            }

            isLeft = !isLeft;
        }

        // if left is still open
        while(left < word1.length()) {
            sb.append(word1.charAt(left));
            left++;
        }

        // if right is still open
        while(right < word2.length()) {
            sb.append(word2.charAt(right));
            right++;
        }

        return sb.toString();
    }
}
