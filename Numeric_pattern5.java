package com.java.printing_pattern;

public class Numeric_pattern5 {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
