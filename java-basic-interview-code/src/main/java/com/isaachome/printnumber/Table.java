package com.isaachome.printnumber;

import java.util.Scanner;

public class Table {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter any positive integer: ");

		Integer enterNum = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.format(" %d * %d = %d \n", i, enterNum, (i * enterNum));
		}

	}
}
