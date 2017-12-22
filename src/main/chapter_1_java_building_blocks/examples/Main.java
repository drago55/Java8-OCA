package main.chapter_1_java_building_blocks.examples;

public class Main {

	public static void main(String[] args) {
		System.out.println(args[0]);
		
	}

	/*
	 * We are printing first argument that we passed in our program
	 * 
	 * When compiled and run with 
	 * 
	 * ---> java Main one two three output will be --> one  this is three elements in array 
	 *  
	 * ---> java Main "one two three" output will be --> one two three this is only one element
	 * 
	 * This will throw Exception ArrayIndexOutOfBounds java Main
	 * Because there is nothing in array and we are calling for first element
	 * 	args.length will print 0 
	 * 
	 */
}


