package main.chapter_4_methods_encapsulation;

public class OverloadingMethods {

    /*
          When overloading methods return type must be the same
          parameter list can be same but in different order  we can put as many parameters as we want
     */

    public void overloadExample() {

        print("Original method with no parameters");

    }


    public void overloadExample(int i) {
        print("Overloaded method with one parameter");
    }

    public void overloadExample(int i, int j) {
        print("Overloaded method with two parameter");
    }

    public void overloadExample(int i, String j) {
        print("Overloaded method with two different parameters");
    }

    public void overloadExample(String j, int i) {
        print("Overloaded method with two same parameters but in different order");
    }

    public void overloadExample(int[] args) {
        print("Overloaded method with array parameter");
    }
    /*
    Will fail to compile because int...args is treated as array so we can't have overloaded method with same parameter
    public void overloadExample(int... args){} //Method with varargs
    */

    private static void print(Object o) {
        System.out.println(o);
    }


    /*
        AutoBoxing example
     */
    private static void myMethod(Integer i) {
        print("In Integer");
    }

    private static void myMethod(Object o) {
        print("In object");
    }

    private static void myMethod(int i) {
        print("in int");
    }

    private static void myMethod(long l) {
        print("in long");
    }

    private static void myMethod(String s) {
        print("in string");
    }

    private static void myMethod(double d) {
        print("in double");
    }

    public static void autoBoxingConversionExample() {

        myMethod("10");
        myMethod(10);
        myMethod(10.0);
        myMethod(10l);
        Object o = new Integer(10);
        myMethod(o);
        myMethod(o);

        /*
            Order to choose the right overloaded method
            Exact match by type
            Larger primitive type
            Autoboxed type
            Varargs

         */

        /*
            tooManyConversions(1); does not compile because java is converting int to long and then it
            needs to convert to Long Object. Only one conversion is possible
         */
        tooManyConversions(1l); //This will compile because we are passing long which is converted to Long

    }

    public static void tooManyConversions(Long l) {
        print("In Long object");
    }

    public static void tooManyConversions(Long... l) {
        print("In Long varargs");
    }

}
