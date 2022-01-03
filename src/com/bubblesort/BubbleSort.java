package com.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of a array:");
		int size = scanner.nextInt();

		int[] arrayint = new int[size];
		int length = arrayint.length;
		System.out.println("Enter the list of number one after one that you want:");

		for (int i = 0; i < length; i++) {
			arrayint[i] = scanner.nextInt();
		}
		scanner.close();

		bubleSort(arrayint);
		printArray(arrayint);

	}

	private static void printArray(int[] arrayint) {
		for (int i : arrayint) {
			System.out.println(i);
		}
	}

	private static int[] bubleSort(int[] arrayint) {
		int temp;
		for (int i = 0; i < arrayint.length; i++) {
			for (int j = 1; j < (arrayint.length - i); j++) {
				// if numbers[j-1] > numbers[j], swap the elements
				if (arrayint[j - 1] > arrayint[j]) {
					temp = arrayint[j - 1];
					arrayint[j - 1] = arrayint[j];
					arrayint[j] = temp;
				}
			}
		}
		return arrayint;
	}

}
