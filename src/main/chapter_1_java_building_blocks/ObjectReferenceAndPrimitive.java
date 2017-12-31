package main.chapter_1_java_building_blocks;

class MyObject{}

public class ObjectReferenceAndPrimitive {
	//Field of primitives will be initialized in default value
	boolean bool; //false
	byte b;  //0
	short s; //0
	int i;   //0
	long l;  //0
	float f; //0.0
	double d; //0.0
	char c;   //'\u0000' (NUL)
	
	//Object reference
	MyObject myObject= new MyObject(); //reference points to MyObject
	MyObject myObject1= new MyObject(); //points to other instance of MyObject
	MyObject myObject2=myObject;  //points to same object as reference of myObject
	MyObject myObject3 = null; // null
	
	//Will NOT compile int k =null;
	/*
	 * We can't assign null value to primitives
	 */
	public void printPrimitives() {
		System.out.println("boolean "+bool+" byte "+b+" short "
	+s+" int "+i+" long "+l+" float "+f+" double "+d+" char "+c);
	}
	
	public void initializPrimitives() {
		bool=false;
		b=0;  
		s=0; 
		i=0;   
		l=0; 
		f=0.0f; 
		d=0.0;
		c=0;   
	}
	
}
