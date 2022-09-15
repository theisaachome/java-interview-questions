package com.isaachome.printnumber;

import java.util.Scanner;

public class ReadSetIntergers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		int evenSum=0;
		int oddSum=0;
		int number = 0;
		
		do {
			System.out.print("Enter the number : ");
			number = sc.nextInt();
			if(number % 2==0) {
				evenSum +=number;
			}else {
				oddSum +=number;
			}
            System.out.print("Do you want to continue y/n? ");
			choice =sc.next().charAt(0);
		} while (choice=='y'|| choice=='Y');
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
	}
}
