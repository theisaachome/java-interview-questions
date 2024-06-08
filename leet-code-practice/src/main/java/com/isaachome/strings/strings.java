package com.isaachome.strings;

public class strings {
    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
    }
    static String reverseString(String s){
        char temp=0;
        char [] reverse =s.toCharArray();
        int left=0, right = s.length()-1;
        while (left<right){
            temp = reverse[left];
            reverse[left]=reverse[right];
            reverse[right]=temp;
            left++;
            right--;
        }
        return new String(reverse);
    }
}
