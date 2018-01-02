package main.chapter_6_exceptions.exceptions_on_methods_constructors;

import main.chapter_6_exceptions.new_exception.MyCheckedExceptionA;
import main.chapter_6_exceptions.new_exception.MyCheckedExceptionB;

public class ClassB extends ClassA {

    public ClassB() {
    }

    public ClassB(String s, int i) throws MyCheckedExceptionB {
    }


    @Override
    public void myMethod() throws MyCheckedExceptionA {

    }
}
