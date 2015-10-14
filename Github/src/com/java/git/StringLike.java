package com.java.git;

public class StringLike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        String searchMe = "This is nice " + "This1 is2 nice3";
	        int max = searchMe.length();
	        int numPs = 0;

	        for (int i = 0; i < max; i++) {
	            // interested only in p's
	            if (searchMe.charAt(i) != 'p')
	                continue;

	            // process p's
	            numPs++;
	        }
	        System.out.println("Found " + numPs + " p's in the string.");
	    }
	
	}


