package com.java.git;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a =8, b =4; 
			//	int retSum =	add();//
				
				System.out.println("The Addition is" + add(a,b));
				
				int retMul =mul(a,b);// method calling

				System.out.println("The multipication is"+ retMul(a,b));// directly calling the sysout
					
					int retDiv = div(a,b);// calling method storing the value in the variable
				
					System.out.println("The division is" +retDiv);/// printing the variable where we have define the value
					print();//method call for void return type
					
				}
			   


				private static int retMul(int a, int b) {
				// TODO Auto-generated method stub
				return mul(0, 0);
			}






				public static int add(int a, int b) // method defination

			     {
			        a = 15;
					int sum = a+b;
					
			         return sum;

			}
			public static int mul(int a, int b)
			{
				

				int mul = a*b;
				return mul;
			}

			public static int div(int a, int b)

			{
				

				int div = a/b;
				return div;
				
			}
			
		public static void print(){
			System.out.println("This is the void method example");
		}
		
				
				
			

	}


