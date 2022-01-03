package com.insertion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InsertionSortMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of a string:");
		int sizeString = scanner.nextInt();

		String[] arrayString = new String[sizeString];
		int length = arrayString.length;
		System.out.println("Enter the list words to be sorted:");

		for (int i = 0; i < length; i++) {
			arrayString[i] = scanner.next();
		}
		scanner.close();

		insertSort(arrayString);
		printArray(arrayString);
	}

	public static <T extends Comparable<T>> T[] insertSort(T[] array) {

		int i, temp;
		for (i = 1; i < array.length; i++) {
			T key = array[i];
			temp = i;

			while (temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp - 1];
				temp--;
			}
			array[temp] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");
	}

}
