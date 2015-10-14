package com.java.git;

//Write a program to find a substring in a given string and then replace it with another string.
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "search and replace of substring ";
		System.out.println("The original string is " + str);

		String searchword = "search";
		String replacedword = "find";

		int startIndexVal = 0;
		int endIndexVal = 0;

		startIndexVal = str.indexOf(searchword);
		endIndexVal = startIndexVal + searchword.length();

		if (startIndexVal != 1) {
			str = str.substring(0, startIndexVal) + replacedword 
					+ str.substring(endIndexVal);

			System.out.println("The modified string is: " + str);

		}

		else {
			System.out.println("There is no match found");
		}

	}

}
