package main.chapter_5_class_design;

class ParentClass {


    public void doesNothing() {
        //it really does nothing
    }

    protected void overrideExample() {

    }

    public void overrideExample2() throws IndexOutOfBoundsException {

    }

    public Object overrideExample3() {
        return new Object();
    }


}


public class OverrideExample extends ParentClass {

    /*

        Overriding methods from parent class
        method in child class must have same signature as the method in the parent class
        must be at least as accessible or more accessible than the method in parent class
        method in the child class may not throw a checked exception that is new or broader than class of any exception thrown in the parrent class method
        method return value must be the same as parent method or a subclass of the method in parent class known as covariant return types
     */

    @Override
    public void doesNothing() {
        print("I do some thing i am overridden");
    }


    //We can make it public since it is broader access modifier
    @Override
    public void overrideExample() {

    }

    // We can throw same exception as in parent class ore more specific
    @Override
    public void overrideExample2() throws StringIndexOutOfBoundsException {

    }

    @Override
    public String overrideExample3() {
        return "It can return object or more specific type";
    }

    private static void print(Object o) {
        System.out.println(o);
    }


}
