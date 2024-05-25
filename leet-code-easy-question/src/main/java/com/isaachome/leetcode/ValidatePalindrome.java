package com.isaachome.leetcode;

public class ValidatePalindrome {

    public static boolean isPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       while (left<right){
           while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
               left++;
           }
           while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
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

    public  static  boolean isPalindrome(int num){
        String s = String.valueOf(num);
        int left=0;
        int right =s.length()-1;
        while (left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        String s4 = "ab  a";
//        System.out.println(isPalindrome(s1)); // Output: true
//        System.out.println(isPalindrome(s2)); // Output: false
//        System.out.println(isPalindrome(s3)); // Output: true
//        System.out.println(isPalindrome(s4)); // Output: true
          System.out.println(isPalindrome(12321));
    }
}
