package com.pr_12_string_regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MassgeSet {

	BufferedReader buffer;

	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "01/01/2016";

	public MassgeSet() {

		buffer = new BufferedReader(new InputStreamReader(System.in));

	}

	public String convertString(Userdetails userDetails, String massage) {
		Pattern patern = Pattern.compile(REGEX_NAME);
		Matcher matcher = patern.matcher(massage);
		massage = matcher.replaceAll(userDetails.getFirstName());

		patern = Pattern.compile(REGEX_FULLNAME);
		matcher = patern.matcher(massage);
		massage = matcher.replaceAll(userDetails.getFirstName() + " " + userDetails.getLastName());

		patern = Pattern.compile(REGEX_MOBILE_NO);
		matcher = patern.matcher(massage);
		massage = matcher.replaceAll(userDetails.getMobileNo());

		patern = Pattern.compile(REGEX_DATE);
		matcher = patern.matcher(massage);
		massage = matcher.replaceAll(userDetails.getDate());

		return massage;

	}

	public String inputString() {
		try {
			return buffer.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return "";

	}

	public int InputInteger() {
		try {
			try {
				return Integer.parseInt(buffer.readLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		return 0;
	}

	public double inputDouble() {
		try {
			try {
				return Double.parseDouble(buffer.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return 0.0;
	}

	public Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	public String getFormatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);

	}

	// Take file name as input and return string of file text
	public String getFileText(String fileName) {
		try {
			buffer = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = buffer.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = buffer.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				buffer.close();
			} catch (IOException ioe) {
			}
		}
	}

	public void writeToFile(String data,String fileName)throws Exception{
	File file = new File(fileName);
	if (!file.exists()) {
		file.createNewFile();
	}
	FileWriter writer = new FileWriter(file); 
	// Writes the content to the file
	writer.write(data); 
	writer.flush();
	writer.close();
}
}
