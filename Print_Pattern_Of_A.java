package com.java.printing_pattern;

public class Print_Pattern_Of_A {

	public static void main(String[] args) {
		int row = 5;

		for (int i = 1; i <= row; i++) {

			for (int j = row - 1; j >= i; j--) {

				System.out.print(" ");

			}

			System.out.print("*");
			
			// Below (2*i)-1 condition is to print spaces in odd series/format.
			for (int j = 1 + 2; j <= (2 * i) - 1; j++) {
				
				// Below condition to print star in 3rd row.
				if (i == 3)
					System.out.print("*");

				else
					System.out.print(" ");

			}
			// Below condition for not to print star in 1st/starting position.
			if(i!=1) {
			for (int j = i; j <= i; j++)
				System.out.println("*");
			}
			else
				System.out.println();
		}

	}

}
