package com.java.printing_pattern;

public class Numeric_pattern9 {

	public static void main(String[] args) {

		int num = 5;
		for (int i = 1; i <= num; i++) { // 1,2,3,4,5,6

			int no = i; // 5

			for (int j = 1; j <= i; j++) { // 1,2,3,4,5,6
				if (j % 2 != 0) { // t
					System.out.print(no + " "); // 15
					no += num - j; // 15
				} else {
					int count = (no + num + j) - i; // (14+5+4)-5=18
					System.out.print(count - i + " "); // 13
					no += num - j; // 15
				}
			}
			System.out.println();
		}
	}
};
