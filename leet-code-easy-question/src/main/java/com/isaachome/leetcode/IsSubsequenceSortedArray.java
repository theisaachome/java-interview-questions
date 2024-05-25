package com.isaachome.leetcode;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
A subsequence of a string is a new string that is formed from the
 original string by deleting some (can be none) of the characters
 without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

        Example 1:

        Input: s = "abc", t = "ahbgdc"
        Output: true
        Example 2:

        Input: s = "axc", t = "ahbgdc"
        Output: false
*/
public class IsSubsequenceSortedArray {
    public static void main(String[] args) {

        String array = "ahbgdc";
        String sub = "abc";
        System.out.println(sortedSquaredArrayString(array, sub));  // Output: true

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(sortedSquaredArrayString(t2, s2)); // Output: false
    }
    public  static  boolean sortedSquaredArrayString(String array, String subArray){
        if(array==null || subArray==null){
            return  false;
        }
        int aIndex=0; int subIndex=0;
        while (aIndex < array.length() && subIndex < subArray.length()){
            if(subArray.charAt(subIndex) ==array.charAt(aIndex)){
                subIndex++;
            }
            aIndex++;
        }
        return  subIndex == subArray.length();
    }
}
