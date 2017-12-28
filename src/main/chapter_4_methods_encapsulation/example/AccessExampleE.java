package main.chapter_4_methods_encapsulation.example;

public class AccessExampleE {

    /*
        AccessExampleE it does not extend but it is in same package
     */

    public void accessExample(){
        /*
            We have to initialize new Object
         */
        AccessExampleA access= new AccessExampleA();
        access.iAmPublicMethod();
        access.iAmProtectedMethod();
        access.iAmDefaultMethod();
        //We cant access private

    }

}
