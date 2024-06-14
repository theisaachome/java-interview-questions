package com.isaachome.slide_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("zxyzxyz"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result=0;
        int l=0;
        Set<Character> setChar = new HashSet<>();
        if(s.isEmpty()){
            return 0;
        }
        for(int r=0;r<s.length();r++){
            while (setChar.contains(s.charAt(r))){
                setChar.remove(s.charAt(l));
                l++;
            }
            setChar.add(s.charAt(r));
            result = Math.max(result,r-l+1);
        }

        return result;
    }

    public int lengthOfLongestSubstringII(String s) {
        if (s.isEmpty()) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
