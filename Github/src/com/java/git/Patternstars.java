package com.java.git;

public class Patternstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			int noOfRows = 0;
			System.out.println("Number of rows to be printed\n");
			Object d = null;
			scanf(d , noOfRows);
	int row,colspaces,colStar = 0;
	for(row=1;row<=noOfRows; row++)
			{
		for(int colSpace = noOfRows-row;colStar>=1;colStar--){
			print(" ");
			
		}
		for(colStar=1;colStar<=row;colStar++){
			
			print("*");
			
		}

	print("\n");

	}


	}

		private static void scanf(Object d, int noOfRows) {
		// TODO Auto-generated method stub
		
	}

		private static void print(java.lang.String string) {
		// TODO Auto-generated method stub
		
	}

		private static Object row(int noOfRows, int i) {
			// TODO Auto-generated method stub
			return null;
		}

	} 