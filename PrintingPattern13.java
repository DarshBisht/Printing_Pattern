package com.java.printing_pattern;

public class PrintingPattern13 {

	public static void main(String[] args) {

		int num = 5;
		// First approach
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i > 1 & j > 1 && i < num & j < num ) {
//				if ((i > 1 && j > 1) && (i < num && j < num)) {
					System.out.print("  ");
				} else
					System.out.print("* ");
			}
			System.out.println();
		}

		// Second approach
//		for (int i = 1; i <= num; i++) {
//			for (int j = i; j <= i; j++) {
//				System.out.print("* ");
//			}
//			if (i == 1) {
//				for (int j = 1; j <= num - 2; j++)
//					System.out.print("* ");
//			}
//
//			if (i == num) {
//				for (int j = 1; j <= num - 2; j++)
//					System.out.print("* ");
//			}
//
//			else if (i > 1 && i < num) {
//				for (int j = 1; j <= num - 2; j++)
//					System.out.print("  ");
//			}
//			System.out.println("* ");
//		}
	}
}
