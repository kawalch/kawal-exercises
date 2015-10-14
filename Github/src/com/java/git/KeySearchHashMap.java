package com.java.git;
import java.util.HashMap;
import java.util.Set;

public class KeySearchHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// Create HashMap of three entries.
			HashMap<String, Integer> h = new HashMap<>();
			h.put("apple", 1);
			h.put("peach", 2);
			h.put("guava", 3);

			// Get keys.
			Set<String> keys = h.keySet();

			// Loop over String keys.
			for (String key : keys) {
			    System.out.println(key);
			}
		    }
		


	}


