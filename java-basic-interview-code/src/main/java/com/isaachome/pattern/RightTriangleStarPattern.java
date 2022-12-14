package com.isaachome.pattern;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
//		printRightTriangle(5);
		printRightTriangleWithNumber(5);

	}

	public static void printRightTriangle(int rows) {
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void printRightTriangleWithNumber(int rows) {
		for(int i=0; i<=rows;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
