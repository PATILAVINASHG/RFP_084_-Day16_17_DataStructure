package com.genericbubblesort;

import java.util.Scanner;

public class BubbleSort<E> {

	static Scanner scanner = new Scanner(System.in);

	public static <E extends Comparable<E>> E[] bubbleSort(E[] array) {
		int i, j;
		int n = array.length;

		for (i = 0; i < n; i++) {

			for (j = 1; j < n; j++) {

				if (array[j - 1].compareTo(array[j]) > 0) {

					E temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;

	}

	public static <E> void printArray(E[] array) {
		System.out.println("Sorted list");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " " + "\n");

		}

	}

	public static int getInteger() {
		return scanner.nextInt();
	}
}
