package main.chapter_2_operators_and_statements;

public class JavaStatements {
		
	
	public static void ifThen() {
		
		boolean isTrue= true;
		/*
		 *  if key word (boolean expression) execute code if true --> { if true }
		 */
		if(isTrue) {
			print("If example ");
		}
		
	}
	
	public static void ifThenElse() {
		
		boolean isTrue= false;
		
		if(isTrue) {
			
		}else {
			print("in else block");
		}
		
	}
	private static void print(Object o) {
		System.out.println(o);
	}
	
	public static void ternaryOperators() {
		// boolean expression ? expresion1 : expression2
		//First operand must be boolean expression and second and third can be any 
		//expression that returns value it cannot be method of void return type
		boolean isTrue =true;
		int a =5, b=4;
		int y= isTrue ? (b=5) : (a=b);  
		print((a>b)?"Greater than " : "smaller than");
	}
	
	public static void switchStatements() {
		/*
		 * Supported data types
		 * byte and Byte, short and Short, char Character, int Integer, String, enum values
		 * flow is directed to first matching branch
		 */
		int i=0;
		switch(i) {} //Valid switch statement
		
		switch(i) {
		case 0: //case may contain 0 statements or more
			break; //break if this case is executed break will exit switch statement
			
		default: //default is optional may appear anywhere within statement 
			//if no matching case are found default will be executed
			break;
		}
		int year =2017;
		switch(year) {
		case 2017: 
			print("Its 2017");
		}
		
	}
	
	public static void whileStatement() {
		/*
		 * Execute code while expression is true
		 * while(boolean expression){
		 *  Body
		 * }
		 * 
		 * infinitive loop while(true){}
		 * 
		 */
		int count=0;
		while(count<=5) {
			print("Counting from 0 to 5 " +count++);
		}
		
	}
	
	public static void doWhileStatement() {
		/*
		 * Java will execute statement block first and then check the loop condition.
		 */
		int count=0;
		do {
			print("Counting from 0 to 5  " + count++);
			print("Will print only once");
		} while (count>=5);
		
	}
	public static void theBasicForStatement() {
		
		/*
		 * 
		 * for(initialization; booleanExpression; updateStatement){
		 * 	Body
		 * }
		 * 	infinitive for loop for(;;)
		 */
		for (int i = 0; i <=5; i++) {
			print("Count from 0 to 5 in for loop " +i);
		}
		
		
	}
	public static void enhancedForLoop() {
		/*
		 * For-each loop
		 * 
		 * for(dataType instance : iterable collection of objects){
		 * 		Body
		 * }
		 * 
		 */
		String[] arrayOfStrings = {"one","two","three"};
		for (String string : arrayOfStrings) {
			print(string);
		}
		
	}
	
	public static void nestedForLoop() {
		//Looping true all elements of 2d array with enhancedForLoop
		int [][] my2DArray= {{1,2,3},{4,5,6},{7,8,9}};
		for (int[] is : my2DArray) {
			for (int i : is) {
				print(i);
			}
		}
		//Looping with standard for loop. With this loop we have better control which and how to print elements  
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				print(my2DArray[i][j]);
			}
		}
		
	}
	
	public static void advanceFlowControl() {
		/*
		 * Optional labels in if, while, doWhile, for, switch
		 * Unlabeled break while, doWhile, for, switch
		 * continue statement while, doWhile, for
		 */
		String[] arrayOfStrings= {"one","twO","thRee","four", "five","Six"};
		
		//Go true all strings in arrays two times
		FIRST : for (int i = 0; i < 5; i++) {
			
		
		SECOND: for (String string : arrayOfStrings) {
			
			if(string.equalsIgnoreCase("three")) { //if you find string three print and continue loop
				print("You are half way in array...");
				continue SECOND;
			}else if(string.equalsIgnoreCase("five")) { //if you find string five break from first
				
				print("It is five stop ");
				break SECOND;
			}
			
			print(string);
			
		}
		if(i>=1) break FIRST;
		}
		
		
	}
	
	
}
