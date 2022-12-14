package com.isaachome.numberprogram;

import java.util.Scanner;

public class AutomorphicProgram {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(isAutomorphic(88) ? "Automorphic!." : "Not Automorphic!.");  
		 checkAutomorphic();
	}
	static boolean isAutomorphic(int num) {
		// get Square of the num
		int square = num * num;
		while(num>0) {
			//find the remainder (last digit) of the variable num and square and comparing them  
			if(num%10 != square%10) {
				return false;
			}
			//reduce num and square by dividing them by 10  
			num = num/10;
			square /= 10; 
		}
		return true;
	}
    
	static void checkAutomorphic() {
		System.out.print("Enter number to check : ");
		int num=sc.nextInt();
		int count =0;
		int square=num* num;
		// store in temp bcos num will be need to check the logic again.
		int temp =num; 
		while(temp>0) {
			count++;
			temp/=10;
		}
		System.out.println("Count :"+count);
		System.out.println("Square :"+square);
		System.out.println( "power : "+Math.pow(10, count));
		System.out.println( "last Digit : "+square / (Math.pow(10, count)));
		// get Last Digit from the input
		int lastDigit = (int)(square % (Math.pow(10, count)));
		if(lastDigit==num) {
			System.out.println(num + " is Auttomorphic.");
		}else {
			System.out.println( num + " is not Automorphic.");
		}
		
	}
}
