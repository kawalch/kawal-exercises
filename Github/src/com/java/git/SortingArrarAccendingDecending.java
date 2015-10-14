package com.java.git;

public class SortingArrarAccendingDecending {
	
	private static int j;
	private static int intj;
	private Object asc;

	public static void main(String[] args) {
	// sorting arrays	
		int[] a= {15,4,1,10,25};
		
		int[] des= sortDescendingOrder(a);
		int[] = sortAsscendingOrder(a);
		System.out.println("Array Sorted in Descending order");
	for( int i =0;i<des.length;i++){
		System.out.println(des[i]);
		
	}
	
	System.out.println("Array soerted in Asscending order");
	for (int i = 0;i<asc.length;i++){
		System.out.println(asc[i]);
		
	}
	public static int[] sortDescendingOrder(int[]a){
		int[] b= sortAsscendingOrder(a);
		int c[]= new int[b.length];
		int j=0;
		for (int i =b.length-1;i>=0;i--){
			c[j]=b[i];
			j++;
		}
		return c;
		
	}
	public static int[] sortAsscendingOrder(int[]a){
		int swap;
		for (intj=0;j<asc.length-1;j++){	
			swap=a[j];
			a[j]= a[j+1];
			a[j+1]= swap;
			
		}
	
	
return a;


}

{
	
}