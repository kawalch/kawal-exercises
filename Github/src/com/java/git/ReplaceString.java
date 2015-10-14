package com.java.git;
import java.io.*;
public class ReplaceString {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This a search and replace of substring example";
		System.out.println("The originsl string is" + str);
		
		
		String searchword = "search";
		String replacedword = "find";
		
		int startIndexVal = 0;
		int endIndexVal = 0;
		
		
		startIndexVal= str.indexOf(searchword);
		endIndexVal = startIndexVal + searchword.length();
		
		if(startIndexVal!= 1){
			str = str.substring(0,startIndexVal) + replacedword + str.substring(endIndexVal);
			
			System.out.println("The modified string is:" + str);
			
			
			
			
		}
		
		
		else {
			System.out.println("There is no match found");
		}
				
		

	}

}
