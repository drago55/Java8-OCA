package main.chapter_6_exceptions.exceptions_on_methods_constructors;

import main.chapter_6_exceptions.new_exception.MyCheckedExceptionB;

public class ClassC extends ClassB {

    public ClassC() {
    }

    public ClassC(String s, int i) throws Exception {
        //In a parent class constructors we are declaring more specific Exception  and in child classes more broader Exception
    }

    @Override
    public void myMethod() throws MyCheckedExceptionB {

        //In a parent class methods we are declaring broader exception and child classes overridden methods more specific exceptions

    }
}
