package com.isaachome.printnumber;

import java.util.Scanner;

public class TestPrime {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		int number;
		System.out.print("Enter Positive Number : ");
		number = sc.nextInt();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag && number > 1) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
