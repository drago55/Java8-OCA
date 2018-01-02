package main.chapter_6_exceptions;

import main.chapter_5_class_design.polymorphism.example2.A;
import main.chapter_5_class_design.polymorphism.example2.B;

public class CommonExceptionTypes {

    /*
        Runtime Exceptions

        ArithmeticException - thrown by JVM when trying to divide by zero

        ArrayIndexOutOfBoundsException - thrown by JVM when using illegal index to access array

        ClassCastException - thrown by JVM when atempting to cast a object to subclass that is not a instance

        IllegalArgumentException thrown by programmer to indicate that a method has been passed an illegal or inappropriate argument

        NullPointerException - throw by JVM when there is a null reference where an object is required

        NumberFormatException - thrown by the programmer when attempt is made to convert a string to a numeric type but the string doesn't have an appropriate format

     */
    /*
        We will wrap all example with try catch block just to print stack trace and not let program crush but we are not required to do so
     */
    public static void arithmeticExceptionExample() {
        try {
            int a = 5;
            int b = 0;
            print(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void arrayIndexOutOfBoundsExceptionExample() {
        int[] array = {0, 1, 2, 3};
        try {
            print(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void classCastExceptionExample() {
        //We will use our polymorphism example
        A a = new A();
        try {

            B b = (B) a; //it will throw exception since object is not a instance of B

        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    public static void illegalArgumentExceptionExample(int num) throws IllegalArgumentException {
        //we will throw a exception to protect method not using illegal argument
        int a = 10;
        if (num == 0) {
            throw new IllegalArgumentException("We cant divide by zero!");

        } else {
            print(a / num);
        }

    }

    public static void nullPointerExceptionExample() {
        //thrown by JVM when accessing instance variables and calling methods on null reference
        String itsNull = null;
        try {
            itsNull.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public static void numberFormatExceptionExample() {
        String illegalNumberInString = "1ab2";
        try {
            int num = Integer.parseInt(illegalNumberInString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
    /*
        Checked Exceptions
        must be handled or declared they can be thrown by programmer or by JVM
        FileNotFoundException -thrown programmaticlly when code tries to referance a file that does not exist
        IOException - thrown when there is problem in reading or writing a file
        FileNotFoundException is subclass of IOException


     */

    /*
        Errors
        Errors extend Error class they are thrown by JVM and shuld not be handled or declared
        ExceptionIninitializerError thrwon by JVM when static initializer throws an aexception and doesnt handle it
        StackOverflowError thrwon by JVM when method calls itself too many times inifinitive recursion
        NoClassDefFoundError thrown by JVM when class is available at compile time but not on runtime


     */
    //recursive infinitive method
    public static void stackOverflowErrorExample(int i) {
        stackOverflowErrorExample(1);
    }


    private static void print(Object o) {
        System.out.println(o);
    }

}
