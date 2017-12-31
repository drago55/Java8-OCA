package main.chapter_5_class_design.abstract_example;

public abstract class AbstractClass extends AbstractParent{

    /*

        abstract classes cant be instantiated directly
        abstract classes may not be marked as private protected and final
        abstract class that extends other abstract class inherits all of its abstract methods as its own abstract methods
        first concrete class that extends an abstract class must provide and implementation
     */

    /*
        Abstract method may only be defined in abstract classes
        Abstract methods may not be declared private and final
        Abstract method mus not provide a method body implementation
        Implementing abstract method in a subclass follows the same rules for overridng method
     */
    public abstract int myOtherMethod();
    public abstract String getString();


}
