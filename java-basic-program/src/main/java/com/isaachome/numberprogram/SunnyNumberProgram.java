package com.isaachome.numberprogram;

import java.util.Scanner;

public class SunnyNumberProgram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		isSunnyNumber(127);
		findSunnyNumbers();
	}

	static void isSunnyNumber(int num) {
		if (isPerfectSquare(num + 1)) {
			System.out.println("The given number is a sunny number.");
		} else {
			System.out.println("The given Number is not a sunny number.");
		}
	}

	private static boolean isPerfectSquare(int num) {
		double sqare_root = Math.sqrt(num);
		return (sqare_root - (Math.floor(sqare_root)) == 0);
	}
	static void findSunnyNumbers() {
		int start = 0, end = 0;
		System.out.println("Enter Sunner Between Range");
		System.out.print("From ");
		start = sc.nextInt();
		System.out.print("To ");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if(isSunny(i))System.out.println(i);
		}
	}
	private static boolean isSunny(int i) {
	  return (Math.sqrt(i+1)%1==0)? true:false;
	}
}
