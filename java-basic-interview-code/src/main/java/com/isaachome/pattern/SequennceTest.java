package com.isaachome.pattern;

public class SequennceTest {
	 public static void main(String[] args) {
		printSequence(100);
	}
	 static void printSequence(int nums) {
		 
		 var fristNum = 0;
		 var secondNum = 1;
		 var temp=0;
		 // 0 + 1=1
		 
		 // 1 + 1=2
				 
		// 0 1  1 2 3 5 8
		 // have loop 
		 for(int i=0;i<100;i++) {
			  temp = fristNum + secondNum;
			 fristNum =secondNum;
			 secondNum = temp;
			 System.out.print(temp +" ");
		 }
	 }
}
