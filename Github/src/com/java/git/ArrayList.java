package com.java.git;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Actual ArrayList:"+arrl);
	        String[] strArr = new String[arrl.size()];
	        arrl.toArray(strArr);
	        System.out.println("Created Array content:");
	        for(String str:strArr){
	            System.out.println(str);
	        }
	    
	}
	
}
