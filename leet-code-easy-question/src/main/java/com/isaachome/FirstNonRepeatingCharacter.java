package com.isaachome;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(  findNonRepeatedCharacter("abcdcaf"));
    }
    public  static int findNonRepeatedCharacter(String string){
        Map<Character,Integer> indexes = new LinkedHashMap<>();
        char[] chars = string.toCharArray();
        for(int i =0;i<string.length();i++){
            if(indexes.containsKey(chars[i])){
                indexes.put(chars[i],-1);
            }else {
                indexes.put(chars[i],i);
            }
        }
        for(Map.Entry<Character,Integer> entry: indexes.entrySet()){
             if(!entry.getValue().equals(-1)){
                 return  entry.getKey();
             }
        }
     return  -1;
    }
}
