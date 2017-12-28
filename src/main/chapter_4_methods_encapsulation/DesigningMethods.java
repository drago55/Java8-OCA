package main.chapter_4_methods_encapsulation;

import java.io.IOException;

public class DesigningMethods {

    /*
        access modifier     optional specifier  return type     method name    parentheses  exception (optional)
        public              final               void            myMethod      (int num)    throws Exception {
                                                                          list of parameters
                method body
        }

     */

    /*
       Access Modifiers are not required to be specified when we don't specify Default access is used

       public  method can be called from any class

       private method can only be called from within the same class

       protected method can only be called from classes in the same package or subclasses

       Default (Package private) Access method can be called from any class within same package

     */
    public void iAmPublic(){
        print("I am public method any class can access this method");
    }
    //Example of private method
    private static void print(Object o) {
        //This can only be accessed from this class
        System.out.println(o);
    }
    protected void iAmProtected(){
        print("I am protected i can be accessed in same package and in classes that extends this class");
    }
    void iAmDefaultMethod(){
        print("I can be accessed in all classes that are in same package");
    }

    /*
        Optional Specifiers

        static this method can be accessed without initializing new object

        abstract can be used in a interface or in a abstract class this type of method doesn't have implementation

        final this method is not allowed to be overridden

        synchronized

        strictfp

     */

    /*
      Some examples with optional specifiers
     */

    public static void iAmStatic(){
        print("In a static method");
    }
    public final static void iAmStaticFinal(){
        print("In a static final method this method cant be overridden");
    }
    public final void iAmFinalMethod(){
        print("In a final method this method cant be overridden");
    }

    /*
        Some examples with return type

        void method doesn't return any value
        It can be any primitive type and any Object

     */
    public Object iReturnAnyClass(){
        Object o= new Object();
        return o;
    }

    public int iReturnInt(){
        return 1;
        }
    /*
        Some examples with parameter list
        Parameter list is required it doesnt have to contain any parameters

     */

    public void noParameters(){}
    public void intParamater(int i){}
    public void multipleParameters(int i, Object o, String myString, Integer j){}

    /*
        Optional Exception list
        We can list as many types of exceptions as you want in this clause separated by commas

     */
    public void noException(){}
    public void oneExcepiton() throws Exception{}
    public void multipleException()throws ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException,IllegalArgumentException {}

    /*
        Working with Varargs
        public void myMethod(String.. args){}
        A var argument must be last element in method's parameter list you are only allowed to have one varargs
        invalid example
        public void myMethod(String...args,int...numbers){} does not compile
        public void myMethod(int...num, String myString){} does not compile
     */

    public void varArgsExample(String... args){
        for (int i = 0; i < args.length; i++) {
            print(args[i]);

        }
    }



}
