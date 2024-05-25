package com.isaachome.leetcode;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(  findNonRepeatedCharacter2("abcdcaf"));
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
                 return  entry.getValue();
             }
        }
     return  -1;
    }
    public  static int findNonRepeatedCharacter2(String string){

        var foundDuplicateChar = false;
        for(int i =0;i<string.length();i++){
           for(int j=0; j<string.length();j++){
               if(string.charAt(i) == string.charAt(j) && i !=j){
                   foundDuplicateChar = true;
               }
           }
           if (!foundDuplicateChar)return i;
        }

        return  -1;
    }
}
