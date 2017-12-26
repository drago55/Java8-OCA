package main.chapter_3_core_java_api;

public class StringBuilderClass {

    /*
        StringBuilder is not immutable


     */


    private static void print(Object o) {
        System.out.println(o);
    }

    public static void creatingStringBuilder() {

        StringBuilder sb1 = new StringBuilder();  //creating StringBuilder with empty sequence of characters and assign sb1 to point to it
        StringBuilder sb2 = new StringBuilder("animal"); //creating StringBuilder containing specific value and assign sb2 to point to it
        StringBuilder sb3 = new StringBuilder(3); // Creating StringBuilder with certain number of slots for characters

        //StringBuilder capacity is automatically increased if it is not enough to store
        StringBuilder sb4 = new StringBuilder(1);
        print(sb4.capacity()); //prints 1
        /*
           value "__"
           index  01
         */
        sb4.append("house");
        print(sb4.capacity()); //prints 5
        /*

             value "house"
             index  01234
         */

    }

    public static void stringBuilderMethods() {

        StringBuilder sb = new StringBuilder("house");
        int length = sb.length(); //returns number of characters
        char ch = sb.charAt(0); //returns character at given index
        print(sb.indexOf("h"));      //returns  int index of a character
        print(sb.indexOf("ho", 4));  // index from a index of string "ho" starting from index 4 it will print -1 because there is no string "ho" from index 4


    }

    public static void appendMethod() {
        /*
            StringBuilder append(String str) //returns itself adds string to current stringBuilder
         */

        StringBuilder sb = new StringBuilder("");
        sb.append(1).append("some");
        sb.append(true);
        print(sb);// prints 1sometrue
    }

    public static void insertMethod() {
        /*
            Insert method adds characters to the StringBuilder at the requested index and returns reference
            to the current StringBuilder object
         */
        StringBuilder sb = new StringBuilder("bla");
        sb.insert(3, "bla");
        print(sb); //Prints blabla

    }

    public static void deleteDeleteAtMethods() {
        /*
            StringBuilder delete(int start, int end)
            String deleteCharAt(int index)
         */
        StringBuilder sb = new StringBuilder("house");
        print(sb.delete(1, 3));//delete characters starting from  index 1 to index 3 without index 3 it will print ->hse
        print(sb.deleteCharAt(0)); //delete character at index 0 it will print --> se
        // StringBuilder object is Mutable we changed this object when we called delete(1,3)
    }

    public static void reverseStringBuilderMethod() {
        /*
        This method does what it says reverse strings in StringBuilder object
            StringBuilder reverse();
         */

        StringBuilder sb = new StringBuilder("house");
        sb.reverse();
        print(sb); //prints "esuoh"
    }

    public static void convertStringBuilderToString() {

        StringBuilder sb = new StringBuilder("house");

        String iAmString = sb.toString(); //converting stringBuilder to string

        print(iAmString.getClass()); //printing type of class

    }

    public static void understandingEqualityOfStringsAndStringBuilder() {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = sb1.append("house");
        print(sb1 == sb2); //prints false
        print(sb1 == sb3);    //prints true

        String a = "house";
        String b = "house";
        String c = " house";
        print(a == b); //Prints true
        print(c.trim() == a); //Prints false because calling a method on string java create new object
        print(a.equals(c.trim())); //This will print true

        String i = new String("house");
        print(i == a); //Prints false we are comparing String object with string pool
        print(i.equals(a)); //Prints true because value in String object is evaluated


    }

}
