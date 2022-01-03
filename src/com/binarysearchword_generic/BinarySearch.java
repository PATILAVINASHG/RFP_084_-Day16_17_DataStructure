package com.binarysearchword_generic;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.binarysearchWord.Search;

public class BinarySearch<T> {

	public static <T extends  Comparable<T>> int binarySearch(T[] array , T key , int left , int right) {
		
		if (left > right )
			
		return 0;
		int mid = (left + right )/2 ;
		
		if (array[mid] .equals(key))
			return 1;
		else if ((array[mid]).compareTo(key) > 0)
			return binarySearch(array, key, left, mid - 1);
		else 
			return binarySearch(array, key, mid + 1, right);
				
			
		}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");	
	}
	  
}
