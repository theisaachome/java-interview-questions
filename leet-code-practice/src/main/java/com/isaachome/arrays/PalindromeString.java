package com.isaachome.arrays;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static  boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
           if(s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)){
               return  false;
           }
           left++;
           right--;
        }
        return true;
    }
}
