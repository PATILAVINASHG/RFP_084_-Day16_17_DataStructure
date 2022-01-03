package com.anagramdetection;

import java.util.Arrays;

public class Anagram {
	
	public boolean anagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] array1 = str1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = str2.toCharArray();
		Arrays.sort(array2);
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
}