package com.java.printing_pattern;

public class Numeric_pattern8 {

	public static void main(String[] args) {

		int num = 5;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0)
				for (int j = 1; j <= 3; j++) {
					count++;
					System.out.print(count + " ");
				}
			else {
				int temp = count + 1; // 4
				for (int j = count + 3; j >= temp; j--) { // 6,5,4,3
					count++; // 4,5,6
					System.out.print(j + " "); // 6,5,4
				}
			}
			System.out.println();
		}
	}
};
