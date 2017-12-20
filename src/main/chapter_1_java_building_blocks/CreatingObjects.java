package main.chapter_1_java_building_blocks;


public class CreatingObjects {
	
	/*
	 * Order of initialization static fields and blocks which ever comes first 
	 * instance fields and instance blocks which ever comes first 
	 * last is constructor
	 */
	
	int i=1; //instance field  
	static int j=1;//static field
	
	static {
		System.out.println("This a static initializer block static field j=" +j);
	}
	
	{
		//This is a instance initializer block
		System.out.println("This is a instance initializer block and instance field  i=" +i);
	}
	
		public CreatingObjects() {
			System.out.println("This is a constructor and it is last to initialize");
			
			Object o = new Object();//Creating new Object with reference of Object o 
			//We are creating object with key word new and we are calling constructor in that class  
			
		}
		
		
}
