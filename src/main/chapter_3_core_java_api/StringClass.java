package main.chapter_3_core_java_api;

public class StringClass {

    private static String myString = "house";

    /*

      String class is Immutable once a String is created it's not allowed to change

     */


    public static void stringExample() {

        //String declaration is String name= "" double quotes single quotes is '' char type

        String name = "Ann";
        print(name);

        String name2 = new String("Ann");
        /*
         String is special and it doesn't need to be instantiated with new but can be and it is less efficient
          String pool contains literal values. Literals are for example variable name -->name
          name2 is string and not a literal so it does not go into string pool.
          Strings that are not in string pool are garbage collected just like any other object
         */

    }

    public static void immutableExample(){

        String someString="I am a String";
        someString.toLowerCase();
        print(someString); // Prints "I am a String"

        someString=someString.toLowerCase(); //we are saving changed string
        print(someString); //Prints "i am a string"

    }

    public static void stringLengthMethod() {
        /*
             myString ->house
             index  ->01234
         */
        // int length() returns the number of characters in String
        print(myString.length()); //will print 5

    }

    public static void stringIndexOfMethod() {
        /*
            int indexOf(int ch)
            int indexOf(int ch, int fromIndex)
            int indexOf(String str)
            int indexOf(String str, int fromIndex)
         */

        print(myString.indexOf('h')); //prints index 0
        print(myString.indexOf("us")); //prints 2 looks for more specific string and returns index if found
        print(myString.indexOf('a', 3)); //prints -1 because no match is found there is no char 'a' from index 3
        print(myString.indexOf("us", 1)); //prints 2

    }
    public static void replaceMethod(){
        /*
            String replace(char oldChar, char newChar)
            String replace(CharSequence oldChar, CharSequence newChar)
         */
        print("AAABBCccaa".replace('A','a')); //prints aaabbCccaa
        print(myString.replace("h","H"));
    }
    public static void trimMethod(){
        /*
         Method removes white spaces from beginning and end of a string
         */

        String string= "        ab  c   b   ";

        print(string.trim()); //prints "ab c b"  without quotes

    }

    public static void methodChaining(){

        /*
            This code creates four different String objects  to read this code start from first method at left side
            to the right all the way to the semicolon
         */

        String result="House  ".trim().toLowerCase().replace("h","H");
        print(result); //Prints "House"  -> first trims to "House" -> goes toLowerCase "house" -> replaces h to H
        /*
            First object is "House  "  second "House" third "house" fourth "House"
         */
    }

    public static void substringMethod() {
        //myString ="house"

        /*
          substring(int beginIndex)
          substring(int beginIndex, int endIndex)  print char from beginIndex to endIndex but without endIndex
        */
        print(myString.substring(2)); //prints use
        print(myString.substring(2, 4)); //prints us
        //print(myString.substring(2,6)); throw exception
    }

    public static void toUpperLowerCaseExample() {

        // String myString= "house"

        print(myString.toUpperCase()); //HOUSE
        print("ABCD3".toLowerCase());  //abcd3
        /*
         Methods do what they say converts string to upper or lower case
         */
    }

    public static void equalsMethods() {
        /*
            boolean equals (Object obj)
            boolean equalsIgnoreCase(String str)
         */
        print("ABC".equals("abc"));// prints false
        print("abc".equalsIgnoreCase("ABc"));
        print("ABC".equals("ABC"));

    }

    public static void startsEndsWithMethods() {

        /*
            boolean startsWith(String prefix)
            boolean endsWith(String sufix)

         */
        print(myString.startsWith("h"));
        print(myString.endsWith("e"));
    }
    public static void containsMethod(){
        /*
            This method looks for matches in the String match can be anywhere in string and is case sensitive
         */
        print(myString.contains("s")); //prints true
        print(myString.contains("S")); //prints false

    }



    public static void stringCharAtMethod() {
        /*
         char charAr(int index)  method prints character at a specific index
          It will throw exception StringIndexOutOfBounds if it is out of range
          */
        print(myString.charAt(0));//prints h
        //print(myString.charAt(7)); will throw exception
    }


    private static void print(Object o) {
        System.out.println(o);
    }

    public static void concatenationExample() {

        // if numbers + means numeric addition
        // if either operand is a String + means concatenation
        // expression is evaluated left to right
        print(1 + 1);    //prints 2
        print("a" + 1); //prints a1
        print("a" + "b"); //prints ab
        print(1 + 2 + "c"); //prints 3c

        String s = "1";
        s += "2";
        s += 3;
        print(s);

    }

}
