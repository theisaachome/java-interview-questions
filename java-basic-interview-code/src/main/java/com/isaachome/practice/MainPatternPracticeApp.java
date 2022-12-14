package com.isaachome.practice;

public class MainPatternPracticeApp {
	public static void main(String[] args) {
		printHalfPyramidWithInvertedWithNumber(5);
	}
	static void printRightTriangleWithStars(int rows) {
		// outer loop for row
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void printRightTriangleWithNumbers(int rows) {
		for(int i=0;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	static void printRightTriangleWithAlphabets() {
		char last='E',alphabet='A';
		for(int i=1;i<= last - 'A'+1;i++) {
			for(int j=1;j<=i;j++ ) {
				System.out.print(alphabet +" ");
			}
			++alphabet;
			System.out.println();
		}
	}
	static void printHalfPyramidInvertedWithStars(int rows) {
		for(int i=rows;i >= 1;--i) {
			for(int j=1;j<=i;++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void printHalfPyramidWithInvertedWithNumber(int rows) {
		for(int i=rows;i >=1 ;--i) {
			for(int j=1;j <=i ;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
