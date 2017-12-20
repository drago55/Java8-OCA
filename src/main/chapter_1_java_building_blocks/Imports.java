

package main.chapter_1_java_building_blocks; //package must be first non-comment

//import must come after package

import java.util.ArrayList; //import tells us where to find class which we will use
import java.util.List; 
import java.util.*;			//using wildcards * it means import all classes in package java.util
/*
 * Wildcards only match class names 
 * You cannot have more than one wildcard this will fail -> import java.nio.*.*;
 * You cannot import methods only class names this will fail-> import java.nio.files.Paths.*;
 * 
 */
//	then comes class
public class Imports {
		
		List<Integer> list= new ArrayList<>();
		/*
		 * There are naming conflicts if we try to import class wit same name from different package 
		 * We can use fully qualified name of Class
		 */
		
		java.sql.Date sqlDate;
		
}
