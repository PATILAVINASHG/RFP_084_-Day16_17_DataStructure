package com.anagramdetection;
import java.util.Scanner;

public class AnagramMain {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string1 and string2 to check for anagram: ");
		
		String str1 = scanner.next();	
		String str2 = scanner.next(); 
		
		Anagram anagramObj = new Anagram();
		
		if(anagramObj.anagram(str1, str2)) {
			System.out.println("Strings are anagram.");
		}
		else {
			System.out.println("Strings are not anagram.");
		}
		scanner.close();
	}

}