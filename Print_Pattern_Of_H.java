/* Print pattern of H 1st approach */
package com.java.printing_pattern;

public class Print_Pattern_Of_H {

	public static void main(String[] args) {

		

		// To print star and spaces in 2 rows
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= 3; j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		
		// To print star in 3rd row
		for (int i = 1; i <= 5; i++) {
			System.out.print("* ");
		}
		
		// To print star and spaces in 4th & 5th rows.
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= 3; j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
	}

}
