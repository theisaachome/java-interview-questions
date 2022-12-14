package com.isaachome.numberprogram;

public class ReverseNumberProgram {
	public static void main(String[] args) {
		inverseNumber(-12345);
	}
	static void inverseNumber(int inputNums) {
		System.out.println("Original Numbers : " +inputNums);
		// get last digit from input using % operator
		// reverse * 10 + remainder
		// remove the last digit 
		boolean isNegative = inputNums<0? true:false;
		int remainder =0;
		int reverse =0;
		if(isNegative) {
			inputNums = inputNums*-1;
		}
		while(inputNums>0) {
			remainder = inputNums%10;
			reverse = reverse*10+remainder;
			inputNums/=10;
		}
		reverse =isNegative ? reverse*-1:reverse;
		System.out.println("Reverse : " + reverse);
	}
}
