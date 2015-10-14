package com.java.git;

public class EnumMonths {	    
	 
	  private static Month month;
	public static void main(String[] args){
	  {
	    Month theDay = Month.March;
	    Object theMonth = null;
		printMonthGreeting(theMonth);
	  }
	
	 
	  {
	    if (month == Month.September)
	      System.out.println("September");
	    else
	      System.out.println("Some other month");
	  }
	   
	
	}
	private static void printMonthGreeting(Object theMonth) {
		// TODO Auto-generated method stub
		
	}
	private void printDayGreeting(Object theMonth) {
		// TODO Auto-generated method stub
		
	}

}       