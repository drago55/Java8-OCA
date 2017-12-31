package main.chapter_5_class_design;


/*
    Applying access modifier
    public can be access referenced and used in any class
    default package private modifier which is lack of access modifier indicates can be accessed only by class within the same package
    private and protected modifier can be applied to inner classes
    All classes that doesn't extend other class automatically extends from java.lang.Object
 */
class A {

    //evan we didn't specify class A inherits from java.lang.Object class
    private int num;

    //We have defined new constructor for a class A
    public A(int num) {
        this.num = num;
    }

}

/*

    Java class design is about code reusability increased functionality and standardization
    It is possible to prevent a class from being extended by  marking it final
    Java supports single inheritance by which a class may inherit from only one direct parent

 */
public class ExtendingClass extends A {

    /*
        access          abstract or             class keyword   class name  extends parent class(optional)
        modifier        final keyword(optional)
        public          abstract                    class       MyClass     extends MyParentClass{
                    class body
        }

     */

    /*
        Because we have defined a constructor in super class we need to call it with super key word in order to compile
        super() refers to constructor in parent class  we can call it only once per constructor and only in first line in child constructor

        if we have two classes with default non defined constructors java explicitly call super() in child class

        class A{
        }
        public class B extends A{

            public B(){
                super() java calls super if there is no constructor in class A we don't have to code it
            }

        }


     */
    public ExtendingClass() {
        super(1);
    }


}
