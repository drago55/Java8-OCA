//
package main;

import main.chapter_1_java_building_blocks.CreatingObjects;
import main.chapter_1_java_building_blocks.ObjectReferanceAndPrimitivs;

public class Main {
	
	static ObjectReferanceAndPrimitivs prim= new ObjectReferanceAndPrimitivs();
	
	/*This is main method entry point to application
	*
	*final public static void main(String[] args){} will compile 
	*
	* args represents array of lang.String objects
	*	
	*  arguments that we pass to when we run java Main arg1 arg2 
	*
	*/
	final public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		initilizingExample();
		primitivesExample();
		
		
		
	}
	public static void initilizingExample() {
		CreatingObjects init= new CreatingObjects();
			
	}
	
	public static void primitivesExample() {
		
		prim.printPrimitives();
	}
	

}
