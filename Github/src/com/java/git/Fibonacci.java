package com.java.git;

public class Fibonacci {
	public static void main (String[] args){
		int prev,next,sum,n;
		prev=1;
		next= 1;
		for ( n=1; n<=10; n++){
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next= sum;
		}
	}
}
