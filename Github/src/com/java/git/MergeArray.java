package com.java.git;

public class MergeArray {

	public static Object main(String[] args) {
		// TODO Auto-generated method stub

		int[] merge(int[] a, int[] b) {

		    int[] answer = new int[a.length + b.length];
		    int i = 0, j = 0, k = 0;

		    while (i < a.length && j < b.length)
		    {
		        if (a[i] < b[j])       
		            answer[k++] = a[i++];

		        else        
		            answer[k++] = b[j++];               
		    }

		    while (i < a.length)  
		        answer[k++] = a[i++];


		    while (j < b.length)    
		        answer[k++] = b[j++];

		    return answer;
		}
		
	}

}
