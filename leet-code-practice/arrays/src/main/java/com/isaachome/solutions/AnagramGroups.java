package com.isaachome.solutions;

import java.util.*;

public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            int counts[] = new int[26];
            for(char c:s.toCharArray()){
                counts[c-'a']++;
            }
            String key = Arrays.toString(counts);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
    public List<List<String>> groupAnagramsII(String[] strs) {
       // make out key from each string value from string array

        // Store in map
        // check if the key is new add key and value
        // if key already exist update the value.
        Map<String, List<String>> ans = new HashMap<>();
        for(String s:strs){
            int counts[] = new int[26];
            for(char c:s.toCharArray()){
                counts[c-'a']++;
            }
            String key = Arrays.toString(counts);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());

    }
}
