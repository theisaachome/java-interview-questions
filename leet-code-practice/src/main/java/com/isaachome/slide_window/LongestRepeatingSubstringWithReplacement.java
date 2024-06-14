package com.isaachome.slide_window;

public class LongestRepeatingSubstringWithReplacement{
    public static void main(String[] args) {
        System.out.println(characterReplacement("AAABABB",1));
    }
    public static int characterReplacement(String s, int k) {
        int N = s.length();
        int [] charCounts = new int[26];
        int left=0;
        int winLength=0;
        int maxFreqCount=0;
        int answer=0;

        for(int right=0;right<N;right++){

            charCounts[s.charAt(right)-'A']++;
            // maxFreq Char Count
            maxFreqCount = Math.max(maxFreqCount,charCounts[s.charAt(right)-'A']);

            if(right-left+1 -maxFreqCount > k){
                charCounts[s.charAt(right)-'A']--;
                left++;
            }
            answer = Math.max(answer,right-left+1 );
        }
        return answer;
    }
}
