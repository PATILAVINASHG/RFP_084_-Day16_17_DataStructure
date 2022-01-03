package com.genericbubblesort;

import java.util.Scanner;

import java.util.Scanner;

public class BubbleSortMain<T> {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of list:");
		int size = BubbleSort.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = BubbleSort.getInteger();
		}
		BubbleSort.bubbleSort(array);
		BubbleSort.printArray(array);

		String[] arrayString = new String[size];
		int length = array.length;
	}
}