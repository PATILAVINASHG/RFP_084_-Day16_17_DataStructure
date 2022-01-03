package com.mergesort;
public class MergeSortString {
	
	public String[] mergeSort(String[] array) {
		if (array.length == 1) {
			System.out.println("It is already sorted: ");
			return array;
		}
		String first[] = new String[array.length / 2];
		String last[] = new String[array.length - (array.length / 2)];
		for (int i = 0; i < first.length; i++) {
			first[i] = array[i];
		}
		int j = 0;
		for (int i = first.length; i < array.length; i++) {
			last[j] = array[i];
			j++;
		}
		first = mergeSort(first);
		last = mergeSort(last);

		String[] returnArray = new String[array.length];
		int firstPos = 0, lastPos = 0;
		for (int i = 0; i < returnArray.length; i++) {
			if (lastPos == last.length) {
				returnArray[i] = first[firstPos];
				firstPos++;
			} else if (firstPos == first.length) {
				returnArray[i] = last[lastPos];
				lastPos++;
			} else if (first[firstPos].compareTo(last[lastPos]) > 0) {
				returnArray[i] = last[lastPos];
				lastPos++;
			} else {
				returnArray[i] = first[firstPos];
				firstPos++;
			}
		}
		return returnArray;
	}
}