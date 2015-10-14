package com.java.git;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

{
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
 
        //1. Using Brute Force Method
 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[i]);
                }
            }
        }
 
        //2. Using HashSet
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }
}

	}


