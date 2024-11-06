package com.leetcode.practice;

/*
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 */
public class PalindromeNumber {

	public boolean isPalindromeUsingString(int x) {

		String numberInString = String.valueOf(x);
		String reversedString = new StringBuilder(numberInString).reverse().toString();

		return numberInString.equals(reversedString);
	}

	public boolean isPalindrome(int x) {

		/*
		 * As negative number, 0, and number divisible by 0 is not a palindrome,
		 * returning false Ex : -121, 0, 100,10000,60,50
		 */
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;

		int reversedNumber = 0;
		while (x > reversedNumber) {
			reversedNumber = reversedNumber * 10 + x % 10;
			x /= 10;

		}

		return (x == reversedNumber || x == reversedNumber / 10); // To return result for even and odd length numbers
	}

}
