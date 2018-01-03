package main.chapter_6_exceptions;

import main.chapter_6_exceptions.new_exception.MyCheckedExceptionA;
import main.chapter_6_exceptions.new_exception.MyUncheckedExceptionA;

import java.io.IOException;

public class ExceptionExample {

    /*
                Exception types

                java.lang.Object
                        |
               java.lang.Throwable
               |                |
     java.lang.Exception       java.lang.Error
                |
    java.lang.RuntimeException

     */

    /*
        Unchecked exceptions or runtime exception that occur at time that program is running.
        Unchecked runtime exception are defined as the RuntimeException class and its subclass.
        Checked exception Java requires the code to either handle them or declare them.
        Checked exceptions includes Exceptions and all subclass that do not extend.

     */

    public void exceptionExample() throws Exception {

        throw new Exception();
        /*
            We are using two different keywords here throw tell Java that you want to throw  an Exception
            and throws declare that method might throw Exceptions
         */

    }

    /*
        Types of exception

        Runtime exception  It's ok to program can catch this type but it is not required
        Checked exception  It's ok to program can catch this type and it is required
        Error              It's not ok to program can catch this type and it is required

     */
    /*
        We can use another try catch finally block inside of try catch finally blocks

        try keyword
        try { Curly braces are required

            the try bloc is also referred to as protected code

        }catch (exception_type identifier){
            type of exception you are trying to catch the identifier refers to the caught exception object
            exception handler block

        } finally{
            //This block is always executed  the only exception that it is not executed when System.exit(0) is called
            which closes java application

            We use finally block to close resources

        }

     */

    public void examplesOfTryCatchBlocks() {
        //Example 1
        try {
            this.exceptionExample();
        } catch (Exception e) {
            e.printStackTrace();//Printing stack shows all methods on a stack
            print(e.getMessage()); //shows just message
            print(e); //prints just type Exception and message
        }
        //Example 2
        try {
            print("in try block");
        } catch (Exception e) {
            print("Exception was thrown" + e.getMessage());
        } finally {
            print("in finally block");
        }
        //Example 3
        try {
            print("Try block without catch block");
        } finally {
            print("Only finally block");
        }
        //Example 4
        try {
            try {

            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {

            } catch (Exception e) {
                e.getMessage();
            }
        }
        //Example 5 will not compile

        /*
           We cant have finally block before catch
        try {

        }finally {

        }catch (Exception e){

        }
        */

    }

    public static void handlingException() {
        //checkedExample(); We are required to handle checked exception evan it doesn't throw one
        try {
            checkedExample();
        } catch (MyCheckedExceptionA myCheckedExceptionA) {
            myCheckedExceptionA.printStackTrace();
        }
        //We are not required to catch but it might throw exception on runtime
        unCheckedExample();

    }

    public static void catchingExceptionExample() {
        //catch block are organized from specific to broader type of Exception
        // compiler will complain if we first catch superclass of exception
        try {
            String[] no = new String[0];
            print(no[0]);
        } catch (StringIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } catch (NullPointerException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } finally {

        }

    }

    private static void checkedExample() throws MyCheckedExceptionA {

    }

    private static void unCheckedExample() throws MyUncheckedExceptionA {

    }

    public static String exceptionExample2() {
        String result = "";

        String v = null;


        try {

            try {
                result += "inner try block ";
                v.length();
            } catch (NullPointerException e) {
                result += " inner catch block ";
                throw new RuntimeException();
            } finally {
                result += " finally inner block ";
                throw new Exception();
            }

        } catch (Exception e) {
            result += " last catch block";
        }


        return result;


    }

    public static void poorExceptionHandlingExample() {
        String text = null;

        try {
            readFile();
        } catch (IOException e) {
            //exception not handled
            //Its good practice to write stack trace or at least print message
            //And consider whether to continuing is best action
            //In this simulated example we failed to read file and it resulted in IOException
            //then we where calling methods on null object witch resulted in null pointer exception
        }
        print(text.replace("", " "));
        //resulting in null pointer exception
    }

    private static void readFile() throws IOException {
        throw new IOException();
    }

    public static void print(Object o) {
        System.out.println(o);
    }

}
