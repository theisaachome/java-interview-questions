package com.isaachome.arrays;

import org.w3c.dom.Attr;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(isIsogramIII("Dermatoglyphics")); // true
        System.out.println(isIsogramIII("isogram"));         // true
        System.out.println(isIsogramIII("aba"));            // false
        System.out.println(isIsogramIII("moOse"));          // false
        System.out.println(isIsogramIII(""));      // true
    }
    public static boolean isIsogram(String s){
        s=s.toLowerCase();
        Set<Character> uniqueChar = new HashSet<>();
        for( char c:s.toCharArray()){
            if(!uniqueChar.add(c))return false;
        }
        return  true;
    }
    public static boolean isIsogramII(String str) {
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();
    }
    public static boolean  isIsogramIII(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.toCharArray()[i] == str.toCharArray()[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
