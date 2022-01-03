package com.findnumber;


import java.util.Scanner;

public class QuestionFindNumberMain {

	public static void main(String[] args) {
		QuestionFindNumber questionFindNumber = new QuestionFindNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int range = (int) Math.pow(2, number);
		System.out.printf("Think a number between 0 and range:", 0, number);
		int yourNumber = questionFindNumber.search(0, range);
		System.out.printf("Your guessing number is %d :", yourNumber);
		scanner.close();
	}
}