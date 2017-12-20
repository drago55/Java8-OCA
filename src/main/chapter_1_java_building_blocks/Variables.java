package main.chapter_1_java_building_blocks;

public class Variables {
	
	//Declaring instance variables
	String  myString ="I am a global instance variable";
	
	int a; int b; 	//they are separated with  ; 
	
	//int a, int b;	//This is not valid 
	
	int c,d;		//We have two int variables c and d
	
	int e=5,g; 		//We have two int variables but e is initialized
	
	//Class or static variables
	static int s,k; //gets a default value
	
		
	public void localVariableExample() {
		
		int a; //local variable must be initialized before use
		
		//System.out.print(a); error in compilation variable  a must be initialized
		
		System.out.println(b); //we are using instance variable which will be set to default value for integer is  0
	}
	
	public void variableScope() {
		String myString="I am a local var";
		
		System.out.println(myString);
		{
			System.out.println(myString);
			
		}
		
	}
	{
		System.out.println(myString);
		
	}
	
	
}
