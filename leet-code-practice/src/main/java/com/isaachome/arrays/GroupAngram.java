package com.isaachome.arrays;

import java.util.*;

public class GroupAngram {
    public static void main(String[] args) {
        System.out.println(findGroupAngramII(new String[]{"act","pots","tops","cat","stop","hat"}));;
    }
    public  static List<List<String>> findGroupAngram(String[] str){
        Map<String,List<String>> ans = new HashMap<>();
        for(String s:str){
            int count[] =new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return  new ArrayList<>(ans.values());

    }
    public static List<List<String>> findGroupAngramII(String [] strs){
        if(strs ==null || strs.length==0)return new ArrayList<>();
        Map<String,List<String>> ansMap = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            String key = String.valueOf(chars);
            if(!ansMap.containsKey(key)) ansMap.put(key,new ArrayList<>());
            ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }
}
