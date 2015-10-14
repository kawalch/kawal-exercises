package com.java.git;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int number = 1 ; number < 100 ; number++ )
	    {
	        boolean shouldPrintNumber = true;

	        System.out.println("\n");
	        if( (number%3) == 0 )
	        {
	            System.out.print("ping");
	            shouldPrintNumber = false;
	        }
	        if( (number%5) == 0 )
	        {
	            System.out.print("pong");
	            shouldPrintNumber = false;
	        }

	        if( shouldPrintNumber )
	        {
	            System.out.print( number );
	        }

	    }
	}
}



