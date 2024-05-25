package com.isaachome.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
       var result = commonCharacters(new String[]{"abc", "bcd", "cbad"});
       for (int i=0;i<result.length;i++){
           System.out.print(result[i]);
       }
    }
    public static  String[] commonCharacters(String[] strings) {
        HashMap<String,Integer> characterCount = new HashMap<>();
        for(String s : strings){
            Set<Character> uniqueCharsInString = new HashSet<>();
            for(int i =0;i<strings.length;i++){
                if(!uniqueCharsInString.contains(s.charAt(i))){
                    uniqueCharsInString.add(s.charAt(i));
                    characterCount.put(Character.toString(s.charAt(i)),
                            characterCount.getOrDefault(Character.toString(s.charAt(i)),0)+1 );
                }
            }
        }
        HashSet<String> returnSet = new HashSet<>();
        for(String c: characterCount.keySet()){
            if(characterCount.get(c)==strings.length){
                returnSet.add(c);
            }
        }
        return  returnSet.toArray(new String[0]);
    }
}
