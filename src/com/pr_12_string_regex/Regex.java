package com.pr_12_string_regex;

import java.util.Date;
import java.util.Scanner;

public class  Regex { 
	static Userdetails userDetails ;
	
	public static void main (String[] args ) {
		MassgeSet mas = new MassgeSet();
		Scanner scanner = new Scanner(System.in);
		userDetails = new Userdetails();
		
		System.out.println("Enter FirstName:");
	
		userDetails.setFirstName(mas.inputString());
		
		System.out.println("Enter the LastName");
		userDetails.setLastName(mas.inputString());
		
		System.out.println("Enter the mobileNumber");
		userDetails.setMobileNo(mas.inputString());
		
		System.out.println("Enter the Date ");
		userDetails.setDate(mas.inputString());
		
		System.out.println(mas.convertString(userDetails ,  mas.getFileText("C:/Users/INDIA/eclipse-workspace/Day16-17program/Data/data.txt1")));
		}
	}


