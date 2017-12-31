package main.chapter_5_class_design;

public interface InterfaceExample extends MyOtherInterface, OneMoreInterfce {

    /*
        Interface can extend other multiple interfaces
        Classes can only extend one class but can implement multiple interfaces
     */

    public static final int CONSTANT = 1;
    int VAR = 3; //it is public static final

    public abstract int getConstant();

    /*
        All variables are public static and final in interface even if we don't specifically say
        and since they have to be final we need to set it.

        public abstract interface MyInterface {

        access modifier abstract keyword (assumed)    keyword required  interface name
        public          abstract                       interface        MyInterface
        }


     */


    /*
        Interface can't be instantiated directly
        interface is not required to have any methods
        interface may not be marked as final
        all top level interfaces are assumed to have the modifiers abstract public in their definition
        all non default methods in a interface are assumed to have the modifiers abstract and public in their definition
        Interface can extend other interface inherits all of the methods as its own abstract methods and can extend multiple interfaces
        First concrete class that implements an interface or extends a abstract class that implements interfaces must provide
        all of the inherited abstract methods
     */

    /*
      Default interface Methods

      default method can only be declared within interface and not within class or  abstract class
      if a method is marked with default it must be provided implementation
      default method is not assumed to be static final or abstract as it may be used overridden by class that implements interface

     */

    public default void myDefaultMethod() {
        System.out.print("Its a default method in interface");
    }

    /*
        Static interface methods

        static method is assumed to be public and will not compile
        to reference the static method, a interface name must be used

     */
     public static int getNumber(){
         return 1;
     }

}
