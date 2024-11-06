package com.infosys.sde;

/*
 * To Find Second Largest Number In An Integer Array
 */
public class FindSecondMax {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 05, 4 };

		System.out.println(findSecondMax(arr));
	}

	public static int findSecondMax(int[] arr) {
		int max = arr[0]; // 10,5,6,3,4
		int secondMax = Integer.MIN_VALUE;
		System.out.println("entered");
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] >= secondMax) {
				secondMax = arr[i];
			}

		}

		return secondMax;

	}

}
