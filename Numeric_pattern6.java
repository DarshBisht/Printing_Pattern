package com.java.printing_pattern;

public class Numeric_pattern6 {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
