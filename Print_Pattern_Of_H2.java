/* Print pattern of H 2nd approach */

package com.java.printing_pattern;

public class Print_Pattern_Of_H2 {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= i; j++) {
				System.out.print("* ");
			}
			// Below condition to print star in 3rd row.
			if (i == 3) {
				for (int j = 1; j <= 3; j++)
					System.out.print("* ");
			}

			else {
				for (int j = 1; j <= 3; j++)
					System.out.print("  ");
			}
			System.out.println("* ");
		}
	}
}
