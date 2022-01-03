package com.findnumber;

import java.util.Scanner;

public class QuestionFindNumber {
	static Scanner scanner = new Scanner(System.in);

	public static int search(int low, int high) {
		if ((high - low) == 1)
			return low;
		int mid = low + (high - low) / 2;
		System.out.printf("Is it less than %d?  ", mid);
		System.out.println();
		System.out.println("Enter the true or false to find your number");
		boolean b = scanner.nextBoolean();
		if (b)
			return search(low, mid);
		else
			return search(mid, high);
	}
}