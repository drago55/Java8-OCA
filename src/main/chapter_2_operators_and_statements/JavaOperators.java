package main.chapter_2_operators_and_statements;

public class JavaOperators {
		
	public static void operatorsExample() {
		
		int a=0;
		//Pre-unary-increment first increment and assign 
		 a=++a;
		 print(a);
		//Pre-unary-decrement first decrement and assign
		 a=--a;
		 print(a);
		//Post increment first assign and increment
		 a=a++;
		 print(a);
		//Post decrement first assign and decrement
		 
	}
	
	public static void promotionExample() {
		byte b=1;
		char c=5;
		/*char result=b*c; will not compile because java is 
		*promoting byte short and char to int when using arithmetic operators result 
		*will be in int and can't fit in char
		*
		*/
		char result_C=(char)(b*c); //We are casting result to char example compile but there can occur overflow or underflow
		int result= b*c; 
		print("Result in int "+result);
		
			
	}
	public static void promotionExample2() {
		int x=1;
		long l=44;
		// result= x+l; result will be in long since it is promoting to larger type
		print(x+l);
	}
	public static void promotionExample3() {
		short x=18;
		float f=31;
		double d=25;
		print(x*f/d);//Result will be in double 
		/*
		 * x will be promoted to int because it is short and when doing arithmetic operation it is promoted to int 
		 * x again will be promoted to float so it can be multiplied with float f and result will be promoted to double so
		 * it can be divided with d final result will be double  
		 */
	}
	
	public static void operatorsExample(int a, int b) throws ArithmeticException {
		print(a/b);
		print(a%b);
		print(a/b);
		print(a*b);
		print(a+b);
		print(a-b);
	}
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
}
