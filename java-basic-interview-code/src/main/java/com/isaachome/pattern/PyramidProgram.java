package com.isaachome.pattern;

public class PyramidProgram {

	public static void main(String[] args) {
		printRightTriangle(3);

	}

	public static void printRightTriangle(int rows) {
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
