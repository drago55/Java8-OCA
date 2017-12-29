package main.chapter_4_methods_encapsulation.example;

import main.chapter_4_methods_encapsulation.ImmutableClass;

import java.util.*;

public class ImmutableExample {

    public static void theProperWay() {
         /*
            When using proper way
         */
        ImmutableClass immutableClass2 = new ImmutableClass("Java", "Oracle", 20);
        ArrayList<String> reference3 = immutableClass2.getMyListCorrect();
        reference3.add("IS not JAVAA");
        ArrayList<String> reference4 = immutableClass2.getMyListCorrect(); //getting list from our class

        print(reference4); //Original list is the same

    }

    public static void theBadWay() {
       /*
            This is a example of bad immutable class we got reference of Mutable object outside of our class
         */
        ImmutableClass immutableClass = new ImmutableClass("Java", "Oracle", 20);
        ArrayList<String> reference = immutableClass.getMyList();
        reference.add("IS not JAVAA");
        ArrayList<String> reference2 = immutableClass.getMyList(); //getting list from our class

        print(reference2); //we changed list in our immutable class witch is bad

    }

    private static void print(Object o) {
        System.out.println(o);
    }

}
