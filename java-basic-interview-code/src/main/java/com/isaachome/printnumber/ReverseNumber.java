package com.isaachome.printnumber;

import java.util.Scanner;

public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numbers ;
		int reverse =0;
		System.out.println("Enter Numbers : ");
		numbers = sc.nextInt();
		
		int temp = numbers;
		int remainder =0;
		while(temp>0) {
		  remainder = temp %10;
		   reverse = reverse * 10 + remainder;
           temp /= 10;
		}
        System.out.println("Reverse of " + numbers + " is " + reverse);
	}
}
