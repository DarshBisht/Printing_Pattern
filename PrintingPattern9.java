package com.java.printing_pattern;

public class PrintingPattern9 {

	public static void main(String[] args) {

		int num = 5;

		for (int i = num; i >= 1; i--) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
};
