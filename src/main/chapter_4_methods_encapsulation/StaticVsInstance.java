package main.chapter_4_methods_encapsulation;

//Static imports

import static java.util.Arrays.asList;

import java.util.List;


class TestClassA {
    //This variable is shared among instance of objects
    private static int staticInt = 0;
    private int instanceInt;

    /*
        Static and Instance initialization blocks
        Order of initialization
        First  static variables or blocks whatever comes first
        Second instance variables and blocks
        Last constructor block
     */
    static {

        //instanceInt=10; we cant change instance variable in static block
        staticInt = 1; //we can change static variables

    }

    /*
        Instance initialization block we can change instance and static variables in instance blocks
     */ {
        instanceInt = 10;
        staticInt = 1;
    }


    public TestClassA() {
        //Constructor of TestClassA they are last in order of initialization
        staticInt++;

    }

    public static void staticMethod() {
    }

    public void instanceMethod() {
    }

    public void changeInt() {
        /*
            We can change static and instance variables from instance methods
         */
        staticInt++;
        instanceInt++;
    }

    public static void willNotCompile() {
        staticInt++; //We can change static variable from static method
        //instanceInt++; will not compile because we can't change instance variable from static method
    }
}

public class StaticVsInstance extends TestClassA {

    private static List<String> listOfStrings;

    /*
        Example of static and final variables final must be initialized and we are not allowed to change it
     */
    private static final int num = 1;

    //private static final int num2; Will not compile we need to initialize
    public void setNum(int i) {
        //  this.num=i; will not compile we can't change final variable
    }

    public static void methodCallExample() {
        staticMethod();//It will compile we can call static method from other static
        //instanceMethod(); will not compile we need to initialize object
        TestClassA test = new TestClassA();
        test.instanceMethod();
    }

    public static void staticImportExample() {

        /*
            We imported static method
            import static java.util.ArrayList.asList;
         */
        listOfStrings = asList("one", "two");


    }

    public static void passingDataExample() {
        /*
            We are passing list to print method
         */
        staticImportExample(); //We will populate list and use static method from static import
        print(listOfStrings);

        /*

            Pass by value and by reference

         */
        int i=8;
        print(i);
        passByValue(i);
        print(i);

        StringBuilder sb= new StringBuilder("Yes");
        print(sb);
        passByReference(sb);
        print(sb);

        /*
            passByValue with return
         */
        i=passByValueWithReturn(i);
        print(i);

    }
    private static int passByValueWithReturn(int i){
        return i=10;
    }
    private static void passByValue(int i){
        i=4;
    }
    private static void passByReference(StringBuilder sb){
        sb.append("itChanged");

    }
    private static void print(Object o) {
        System.out.println(o);
    }

}
