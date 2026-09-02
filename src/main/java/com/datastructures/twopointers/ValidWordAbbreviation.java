package com.datastructures.twopointers;

public class ValidWordAbbreviation {

    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;

        while (i < word.length() && j < abbr.length()) {
            if(Character.isDigit(abbr.charAt(j))) {
                if(j>= abbr.length() || abbr.charAt(j) == '0') return false;
                StringBuilder  builder = new StringBuilder();
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    builder.append(abbr.charAt(j++));
                }
                i = i+Integer.parseInt(builder.toString());
                int test = i-word.length();
                if(test>0)return false;
            }else if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
            }else{
                return false;
            }
        }

        return i == word.length() && j == abbr.length() ? true: false;
    }
}
