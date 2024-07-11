package com.isaachome.slide_window;

import java.util.HashSet;
import java.util.Set;

public class SlideWindowPlayground {
    public static void main(String[] args) {
        System.out.println(LongestRepeatingSubstring("AAABABB",1));
//        System.out.println(LongestRepeatingSubstring("pAABABB",1));

    }
    public static int findLong(String s){
        int maxLength=0;
        int left=0;
        if(s==null || s.isEmpty())return 0;

        Set<Character> uniqueChar = new HashSet<>();

        for(int right=0;right<s.length();right++){
            while (uniqueChar.contains(s.charAt(right))){
                uniqueChar.remove(s.charAt(left));
                left++;
            }
            uniqueChar.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static int LongestRepeatingSubstring(String s,int k){
        // To store count of each character
        int[] countChar = new int[26];
        int left = 0, right = 0, maxCount = 0, maxLength = 0;
        if(s==null || s.isEmpty())return 0;
        s= s.toUpperCase();
        while(right < s.length()){
            countChar[s.charAt(right)-'A']++;
            int b = countChar[s.charAt(right) - 'A'];
            maxCount = Math.max(maxCount, b);

            while (right-left+1-maxCount > k){
                countChar[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
