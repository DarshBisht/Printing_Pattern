package com.java.printing_pattern;

public class PrintingPattern14 {

	public static void main(String[] args) {

		int num = 5;

		// First part
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		// Second part
		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
};
