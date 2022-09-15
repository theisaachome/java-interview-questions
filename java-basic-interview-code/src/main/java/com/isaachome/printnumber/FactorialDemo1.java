package com.isaachome.printnumber;

import java.util.Scanner;

//4!= 4*3*2*1 => 24
public class FactorialDemo1 {

	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Positive Value : ");
		int enterValue = console.nextInt();
		int result = 1;
		for(int i =1;i<=enterValue;i++) {
			result = i * result;
		}
		System.out.println(result);
	}
}
