package com.isaachome.printnumber;


//## Question 2

//### Write a program to calculate the sum of first 10 natural number.

public class SumNumbers {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i <=10; i++) {
			sum +=i;
		}
		System.out.format("Sum of first 10 Natural number: %d.",sum);
	}
}
