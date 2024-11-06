package com.infosys.sde;

import java.util.Scanner;

public class PrintFirstNFibonacci {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println(fibonacciSeriesWithIteration(i));
				System.out.println(fibonacciSeriesWithRecursion(i));
			}
		}

	}

	private static int fibonacciSeriesWithIteration(int i) {
		int first = 0;
		int second = 1;
		int sum = 1;
		if (i == 0 || i == 1) {
			return i;
		} else {
			sum = first + second;
			first = second;
			second = sum;
			return sum;
		}
	}

	private static int fibonacciSeriesWithRecursion(int i) {
		if (i == 0 || i == 1) {
			return i;
		} else {
			return fibonacciSeriesWithRecursion(i - 2) + fibonacciSeriesWithRecursion(i - 1);
		}
	}

}
