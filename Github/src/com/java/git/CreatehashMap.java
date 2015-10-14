package com.java.git;
import java.util.HashMap;
public class CreatehashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create new HashMap.
			// ... Uses diamond inference on right side.
			HashMap<String, Integer> hash = new HashMap<>();

			// Put three keys with values.
			hash.put("dog", 1);
			hash.put("cat", 2);
			hash.put("rabbit", 3);

			// Look up some known values.
			int a = hash.get("dog");
			int b = hash.get("cat");

			// Display results.
			System.out.println(a);
			System.out.println(b);
		    }
		

	}


