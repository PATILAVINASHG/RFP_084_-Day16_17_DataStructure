package com.mergesort;

import java.util.Scanner;

public class MergeSortMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int count = scanner.nextInt();
		String[] strings = new String[count];

		System.out.print("Enter Strings to sort: ");
		for (int i = 0; i < count; i++) {
			strings[i] = scanner.next();
		}
		scanner.close();

		MergeSortString mergeSort = new MergeSortString();
		strings = mergeSort.mergeSort(strings);

		System.out.println("Sorted list:");
		for (String string : strings) {
			System.out.println(string);
		}
	}
}