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


    private static void print(Object o) {
        System.out.println(o);
    }


    /*
        AutoBoxing example
     */
    private static void autoBox(Integer i){
        print("In Integer");
    }
    private static void autoBox(Object o){
        print("In object");
    }
    private static void autoBox(int i){
        print("in int");
    }
    private static void autoBox(long l){
        print("in long");
    }
    private static void autoBox(String s){
        print("in string");
    }
    private static void autoBox(double d){
        print("in double");
    }
    public static void autoBoxingExample(){

        autoBox("10");
        autoBox(10);
        autoBox(10.0);
        autoBox(10l);
        Object o= new Integer(10);
        autoBox(o);
        autoBox(o);
    }

}
