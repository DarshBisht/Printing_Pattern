package com.java.printing_pattern;

public class Print_Pattern_Of_Dimond {

	public static void main(String[] args) {
		int row=5;
		
		// First part
		for (int i = 1; i <= row; i++) {

			for (int j =row-1 ; j >= i; j--) {	//
				System.out.print("  ");
			}
			for (int j =1 ; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j =1 ; j <= i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Second part
		for (int i = row-1; i >= 1; i--) {

			for (int j =row-1 ; j >= i; j--) {	//
				System.out.print("  ");
			}
			for (int j =1 ; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j =1 ; j <= i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
