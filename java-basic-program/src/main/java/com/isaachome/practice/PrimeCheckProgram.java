package com.isaachome.practice;

public class PrimeCheckProgram {
	public static void main(String[] args) {
		  checkPrime(1);  
		  checkPrime(3);  
		  checkPrime(17);  
		  checkPrime(20);  
	}
	static void checkPrime(int num) {
		int flag = 0;
		int result = 0;
		result = num / 2;
		if (num == 0 || num == 1) {
			System.out.printf("%d is not Prime Number.\n", num);
		} else {
			for (int i = 2; i <= result; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number.");
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(num + " is prime number.");
			}
		}

	}
}
