package com.primenumerPalindrom8;

import java.util.Arrays;

public class PrimeAnagramPalindrome {

	public boolean anagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] array1 = str1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = str2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public String[] prime(int range) {
		String[] array = new String[range];
		int position = 0;
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {

				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}

	public boolean palindrome(String string) {
		if (string.length() < 2) {
			return false;

		}

		char[] array = string.toCharArray();
		int n = array.length;

		for (int i = 0; i < n; i++) {
			if (array[i] != array[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
