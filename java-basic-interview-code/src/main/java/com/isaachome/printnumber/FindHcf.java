package com.isaachome.printnumber;

import java.util.Scanner;

public class FindHcf {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int dividend, divisor;
		int remainder,hcf=0;
		
		System.out.print("Enter the first Number:");
		dividend = sc.nextInt();
		System.out.print("Enter the Second Number");
		divisor = sc.nextInt();
		do {
			remainder = dividend % divisor;
			if(remainder ==0) {
				hcf = divisor;
			}else {
				dividend = divisor;
				divisor  = remainder;
			}
		} while (remainder !=0);
        System.out.println("HCF: " + hcf);
	}
	
}
