package com.isaachome.practice;

import java.util.Scanner;

public class MainPracticeApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int inputNum;
		boolean flag = true;
		System.out.print("Enter Number :");
		inputNum = sc.nextInt();

		for (int i = 2; i < inputNum; i++) {
			if (inputNum % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag && inputNum > 1) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
