package main.chapter_1_java_building_blocks.examples;

public class Dog {

	public static void main(String[] args) {
		Dog dog1 = new Dog();  //dog1 reference point to --> Dog object
		Dog dog2= new Dog();   //dog2 reference point to --> to other Dog object
		Dog dog3=dog1; 		   //dog3 reference point to --> to dog1 object
		dog1 = null;    	   //dog1 reference is not pointing to any object its pointing to null, however dog3 reference still points to first Dog created object
		Dog dog4= dog1;		   //dog4 reference point to --> dog1 which is pointing to null
		dog3 = null;           //dog3 reference is nulled and first Dog object is eligible for garbage collection
		dog2= null;			   //dog3 reference is nulled and and second Dog object does not have reference and is eligible for garbage collection 
		dog2= new Dog();	   //dog2 reference points to new different Dog object 
		/*
		 * This was example of reference and when objects are eligible for garbage collection  
		 * 
		 */
		

	}

}
