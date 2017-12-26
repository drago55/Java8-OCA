package main.chapter_3_core_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

    /*
          In order to use ArrayList we need to import it
          import java.util.ArrayList;
          or import java.util.*; import whole package
     */


    private static void print(Object o) {
        System.out.println(o);
    }

    public static void creatingArrayList() {
        ArrayList list = new ArrayList(); //default number of spaces and not to fill it
        ArrayList list2 = new ArrayList(10); //Creating array list with specific number of slots
        ArrayList list3 = new ArrayList(list2); // Copying size and content of list2 to list3 reference
        /*
            We can specify type of class that ArrayList contain
         */
        ArrayList<String> myStringList = new ArrayList<String>();
        ArrayList<String> myStringList2 = new ArrayList<>(); //Since java 7 you can omit type on the right side <>
        /*
            Referencing ArrayList as a List<String> list = new ArrayList<>(); List is interface that ArrayList implements
         */
    }

    public static void addMethodArrayList() {
                /*

                    boolean add(E element)
                    void add(int index, E element)
                */

        ArrayList list = new ArrayList();
        list.add("String");
        list.add(Boolean.TRUE);
        print(list);

                /*
                    Since we didn't specify type to store in array list java stores Object type  which includes everything except primitives
                 */

        ArrayList<String> stringList = new ArrayList<>();
                /*
                    stringList.add(Boolean.TRUE); it will not compile since we specified type String
                 */

    }

    public static void removeMethod() {

            /*
                boolean remove(Object o)
                E remove(int index)
             */
        List<String> myStringList = new ArrayList<>();
        myStringList.add("one");
        myStringList.add("two");
        myStringList.add("three");
        print(myStringList.remove("one")); //Prints true
        print(myStringList.remove("one"));  //Prints false since it is already removed
        print(myStringList.remove(0)); //removes object at first index

    }

    public static void setMethod() {

        /*
             E set(int index, E newElement)
             Changes one element of the arrayList

         */
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.set(0, "two");
    }

    public static void isEmptySize() {

        /*
            boolean isEmpty() //Returns true if is empty
            int size()  //Returns number of elements in Array
         */
        ArrayList<String> list = new ArrayList<>();
        print(list.isEmpty());
        print(list.size());

    }

    public static void clearContainsAndEquals() {
        /*
            void clear() removes all elements in ArrayList
            boolean contains()  method checks whether a certain value is in ArrayList
            boolean equals(Object o) //We can compare two lists to see if they contain the same elements in the same order
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        ArrayList<String> list2 = list;
        print(list.contains("one")); //Prints true
        print(list.equals(list2));  //Prints true
        list.clear();               //Clearing list
        print(list.isEmpty());      //Prints true


    }

    public static void autoboxingExample() {

        List<Integer> num = new ArrayList<>();
        num.add(new Integer(1));
        num.add(2); //if we add primitive type in a list it will be autoboxed to Integer object

    }

    public static void convertingBetweenArrayAndList() {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        String[] stringArray = list.toArray(new String[0]);
        print(stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            String s = stringArray[i];
            print(s);
        }
        /*
            Converting array to a List are linked it means any change is made to one is available to other
            it is a fixed-size list backed Liste becouse array changes with it
         */
        String[] array = {"one", "two"};
        List<String> list2 = Arrays.asList(array);

        print(list2.size()); //Prints size of 2
        list2.set(0, "num");
        array[1] = "three";
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
            //Prints  num, three array was changed too
        }
        //list2.remove(0); will throw UnsupportedOperationException we are not allowed to change size of a list

    }

    public static void sortingMethod() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);
        numbers.add(6);
        Collections.sort(numbers);
        print(numbers);

    }

}
