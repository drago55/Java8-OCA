package main.chapter_4_methods_encapsulation.lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyLambda {

    /*

        Lambda Syntax
        simplest lambda expression

        a->a.isPassed()

        a parameter name -> arrow body a.isPassed()

        (Student s) -> {return s.isPassed();}
        Student optional parameter type s parameter name -> arrow return s.isPassed(); required because in block

     */

    public MyLambda() {

    }

    /*

        Lambda works with interfaces that have only one method we call them functional interfaces
        we will test it with Predicate<T> interface which is built in interface and we will create our own interface
        as well we will show old way.

     */
    //Print using our lambda and using TheOldWay class
    public static void printStudents(List<Student> list, CheckIfPass check) {

        for (Student student : list) {
            if (check.isPassed(student)) {
                print("Students that have passed exam " + student.getName());
            } else {
                print("Students that have FAILED " + student.getName());
            }
        }
    }

    public static void printWithLambdaPredicate(List<Student> list, Predicate<Student> p) {
        for (Student student : list) {
            if (p.test(student)) {
                print("Students that have passed exam " + student.getName());
            } else {
                print("Students that have FAILED " + student.getName());
            }
        }

    }

    public static void usingNoArgumentLambda(NoArgumentLambda lambda) {
        lambda.run();
    }

    public static void print(Object o) {
        System.out.println(o);
    }

}
