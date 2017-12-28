package main.chapter_4_methods_encapsulation.example;

public class AccessExampleB extends AccessExampleA {

    /*
       AccessExampleB is in same package and it is extending AccessExampleA class
     */

    public void accessExample() {
        //We can initialize new object and use all methods but this refers to "access" reference object in this method
        AccessExampleA access = new AccessExampleA();
        access.iAmDefaultMethod();
        access.iAmProtectedMethod();
        access.iAmPublicMethod();
        //We cant access private methods
        /*
            And we can use methods directly over extension
         */

        iAmDefaultMethod();
        iAmProtectedMethod();
        iAmPublicMethod();
        //We can't access private methods
    }


}
