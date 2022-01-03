package com.binarysearchword_generic;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain<T> {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of list:");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);

		System.out.println("Enter the Key Element to Search..");
		int key1 = scanner.nextInt();

		if (BinarySearch.binarySearch(array, key1, 0, array.length - 1) != 0)
			System.out.println("Element Found..");
		else
			System.out.println("Element not Found..");
		forString(scanner);
	}
	public static void forString(Scanner  scanner) {
	System.out.println("Enter the size of a string:");
	int sizeString = scanner.nextInt();
	String[] arrayString = new String[sizeString];
	{

		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i] = scanner.next();
		}
		Arrays.sort(arrayString);
		System.out.println("Sorted array is:" + Arrays.toString(arrayString));

		System.out.println("Enter the Key Element to Search..");
		String key2 = scanner.next();
		if (BinarySearch.binarySearch(arrayString, key2, 0, arrayString.length - 1) != 0)
			System.out.println("Element Found..");
		else
			System.out.println("Element not Found..");
	}
}
}