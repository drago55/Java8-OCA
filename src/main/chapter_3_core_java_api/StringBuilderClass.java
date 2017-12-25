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

    public static void appendMethod(){
        /*
            StringBuilder append(String str) //returns itself adds string to current stringBuilder
         */

        StringBuilder sb = new StringBuilder("");
        sb.append(1).append("some");
        sb.append(true);
        print(sb);// prints 1sometrue
    }
    public static void insertMethod(){
        /*
            Insert method adds characters to the StringBuilder at the requested index and returns reference
            to the current StringBuilder object
         */
        StringBuilder sb = new StringBuilder("bla");
        sb.insert(3,"bla");
        print(sb); //Prints blabla

    }
    public static void deleteDeleteAtMethods(){
        /*
            StringBuilder delete(int start, int end)
            String deleteCharAt(int index)
         */
        StringBuilder sb = new StringBuilder("house");

    }

}
