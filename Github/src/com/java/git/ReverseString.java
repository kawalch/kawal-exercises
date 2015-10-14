package com.java.git;

import java.util.Scanner;


//Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			String original;
			String reverse = "";
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter a String to revrse ");
			original = in.nextLine();
			int lenght = original.length();
			
			for (int i = lenght - 1; i >= 0; i--){
				
				reverse = reverse + original.charAt(i);
				
			}
				
			
			System.out.println("Reverse of enter String is:" + reverse);
			
		}

	

	

}
