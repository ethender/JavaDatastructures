package com.datastructures.twopointers;

public class ValidWordAbbreviation {

    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;

        while (i < word.length() && j < abbr.length()) {
            if(Character.isDigit(abbr.charAt(j))) {
                StringBuilder  builder = new StringBuilder();
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    builder.append(abbr.charAt(j++));
                }
                i = i+Integer.parseInt(builder.toString());
            }else if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
            }else{
                return false;
            }
        }

        return true;
    }
}
