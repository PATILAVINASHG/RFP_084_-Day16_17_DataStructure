package com.binarysearchWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderClass {

	public static void main(String[] args) throws Exception {
		try {
		Scanner scanner = new Scanner(System.in);

		File file = new File("C:/Users/INDIA/eclipse-workspace/Day16-17program/Data/data.txt");
		
		String str[] = FileRead(file);
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("Enter word to search");
		String s = Search.scan.nextLine();
		int n = Search.binary(str, s);
		if (n > 0) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		Search.scan.close();
	} catch (Exception e) {
		System.out.println(e);
	}
	}
	private static String[] FileRead(File file) throws Exception {

		FileReader fileReader = new FileReader(file);
		ArrayList<String> s1 = new ArrayList<String>();
		String word = "";
		int a;
		while ((a = fileReader.read()) != -1) {
			if (a == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) a);
			}
		}
		fileReader.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}
			
}