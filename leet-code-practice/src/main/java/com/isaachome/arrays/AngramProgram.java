package com.isaachome.arrays;

import java.util.HashMap;
import java.util.Map;

public class AngramProgram {
    public static void main(String[] args) {
        System.out.println( isAngramHashMap("racecar","carrace"));
        System.out.println( isAngramHashMap("jar","car"));
    }
    public static boolean isAngram(String s, String t){
        if(s.length() != t.length())return  false;
        int[] store = new int[26];
        for (int i=0; i<s.length();i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for(int n:store) if(n !=0) return  false;
        return true;
    }
    public  static  boolean isAngramHashMap(String s,String t){
        if(s.length() !=t.length())return false;
        Map<Character,Integer> charCountMap = new HashMap<>();
        for(char c: s.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            if(!charCountMap.containsKey(c))return  false;
            charCountMap.put(c,charCountMap.get(c)-1);
            if(charCountMap.get(c)==0){
                charCountMap.remove(c);
            }

        }
        return charCountMap.isEmpty();
    }
}
