package com.isaachome.practice;

import java.util.Scanner;

public class PalindromeProgram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		checkPalindrome(101);
		checkPalindromeWithString();
	}
	static void checkPalindrome(int inputNumbs) {
		// accept the number variable to be checked for palindrome  
		int temp=inputNumbs;
		int remainder=0;
		int reverse = 0;
		while(temp>0) {
			remainder = temp % 10;//
			reverse = (reverse*10)+remainder;
			temp /=10;
		}
		if(inputNumbs==reverse) {
			 System.out.println("palindrome number ");    
		}else {
			System.out.println("not palindrome");    
		}
	}

	static void checkPalindromeWithString() {
	      String original, reverse = ""; // Objects of String class  
	      System.out.print("Enter String Value : ");
	      original=sc.nextLine();
	      int length = original.length();
	      // loop from the last index of input
	      for(int i=length-1;i>=0;i--) {
	    	  reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse)) 
			System.out.println("Entered String/number is Palindrome");
	      else System.out.println("Entered String/number is not Palindrome");
		
	}
}
