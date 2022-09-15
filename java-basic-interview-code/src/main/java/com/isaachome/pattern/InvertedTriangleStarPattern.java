package com.isaachome.pattern;

public class InvertedTriangleStarPattern {
	public static void main(String[] args) {
		printInvertedTriangleStarPattern(5);
	}
	public static void printInvertedTriangleStarPattern(int rows) {
		for(int i=rows;i>=1;--i) {
			for(int j=1;j<=i;++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
