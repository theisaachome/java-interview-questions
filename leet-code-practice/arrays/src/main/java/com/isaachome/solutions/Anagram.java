package com.isaachome.solutions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charMapCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMapCount.put(c,charMapCount.getOrDefault(c,0) + 1);
        }
        for (char c : t.toCharArray()) {
            if(!charMapCount.containsKey(c))return false;
            charMapCount.put(c,charMapCount.getOrDefault(c,0) - 1);
            if(charMapCount.get(c) == 0) {
                charMapCount.remove(c);
            }

        }
        return charMapCount.isEmpty();
    }
    public boolean isAnagramII(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] counts = new int[26];
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int n:counts){
            if(n != 0) return false;
        }
        return true;
    }
}
