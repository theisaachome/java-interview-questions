package com.isaachome.printnumber;

import java.util.Scanner;

public class PowerBase {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int base;
		int power;
		int result=1;
		System.out.print("Please Enter Base : ");
		base = console.nextInt();
		
		System.out.print("Please Enter Power : ");
		power = console.nextInt();
		
		for(int i=1; i<= power; i++) {
			 result  *= base;
		}
		System.out.format("%d power %d = %d \n",base,power,result);
	}
}
