package com.java.printing_pattern;

public class PrintingPattern12 {

	public static void main(String[] args) {

		int num = 5;
		
		// print spaces
		for (int i = 1; i <= num; i++) {
			for (int j = 1+1; j <= i; j++) {
				System.out.print("  ");
			}
			// print star
			System.out.print("* ");
			//Print spaces
			for (int j = num; j >= (i*2)-num+2; j--) {
				System.out.print("  ");
			}
			if(i<=num-1)
			System.out.println("* ");
		}
	}
}
