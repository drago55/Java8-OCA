package main;

import main.chapter_1_java_building_blocks.CreatingObject;
import main.chapter_1_java_building_blocks.ObjectReferenceAndPrimitive;
import main.chapter_1_java_building_blocks.Variables;
import main.chapter_3_core_java_api.*;
import main.chapter_4_methods_encapsulation.OrderOfInitialization;
import main.chapter_4_methods_encapsulation.OverloadingMethods;
import main.chapter_4_methods_encapsulation.example.ImmutableExample;
import main.chapter_4_methods_encapsulation.lambda_example.MyLambda;
import main.chapter_4_methods_encapsulation.lambda_example.Student;
import main.chapter_5_class_design.polymorphism.DogExample;
import main.chapter_5_class_design.polymorphism.example2.A;
import main.chapter_5_class_design.polymorphism.example2.B;
import main.chapter_5_class_design.polymorphism.example2.C;
import main.chapter_5_class_design.polymorphism.example2.Implementation;
import main.chapter_6_exceptions.ExceptionExample;

import java.util.ArrayList;

public class Main {

    static ObjectReferenceAndPrimitive prim = new ObjectReferenceAndPrimitive();

    /*
     * This is main method entry point to application
     *
     * final public static void main(String[] args){} will compile
     *
     * args represents array of lang.String objects
     *
     * arguments that we pass to when we run java Main arg1 arg2
     *
     */
    final public static void main(String[] args) {

        //Example of using class when we have same name we can use full name package
        //We are calling static method in Class Main that is is in examples package and we are passing array of string
        //main.chapter_1_java_building_blocks.examples.Main.main(new String []{"one"});

        //initializingExample();
        //primitivesExample();
        //variableScopeExample();
        //javaOperators();
        //javaStatements();
        //stringExamples();
        //stringBuilderExample();
        //javaArrays();
        //arrayListClass();
        //wrapperClasse();
        //javaDateTimeClass();
        //staticVsInstance();
        //overloadMethods();
        //orderOfInitialization();
        //immutableClass();
        //lambdaExample();
        //dogExample();
        //polymorphism();
        exceptionExample();
    }

    public static void exceptionExample() {
        //ExceptionExample.handlingException();
        print(ExceptionExample.exceptionExample2());
    }

    public static void polymorphism() {
        //  Implementation.example();
        Implementation.polymorphicParameters(new A());
        Implementation.polymorphicParameters(new B());
        Implementation.polymorphicParameters(new C());
        Implementation.polymorphicParameters(new Implementation());

    }

    public static void dogExample() {
        DogExample.example();
        DogExample.castingObject();
        DogExample.virtualMethodExample();
    }

    private static void print(Object o) {
        System.out.println(o);
    }

    public static void lambdaExample() {
        //We crated some data that we will test with lambda expression
        /*
            Lambda expression is anonymous method it has parameters and body just like all method do but it doesn't have name

            void runMyLambda((Object o)->{
            return o.doSomething()
            });

         */
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("Toni", 1);
        Student s2 = new Student("Marko", 5);
        Student s3 = new Student("John", 3);
        Student s4 = new Student("Craig", 4);
        Student s5 = new Student("Ann", 2);
        Student s6 = new Student("Michael", 1);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        //The old way
        // MyLambda.printStudents(list, new TheOldWay());
        //Our lambda expression used with our  functional interface
        //MyLambda.printStudents(list, a -> a.isPassed());
        //Builtin lambda predicate
        //MyLambda.printWithLambdaPredicate(list, p -> p.isPassed());
        //Different syntax
        MyLambda.printStudents(list, (Student s) -> {
            return s.isPassed();
        });

        MyLambda.usingNoArgumentLambda(() -> print("Hello world from no argument lambda"));


    }

    public static void immutableClass() {
        ImmutableExample.theBadWay();
        ImmutableExample.theProperWay();
    }

    public static void orderOfInitialization() {
        OrderOfInitialization order = new OrderOfInitialization();
    }

    public static void staticVsInstance() {
        //StaticVsInstance.passingDataExample();

    }

    public static void overloadMethods() {
        OverloadingMethods.autoBoxingConversionExample();
    }

    public static void javaDateTimeClass() {
        //JavaDateTimeClass.dateTimeExample();
        //JavaDateTimeClass.formattingDateTime();
        //JavaDateTimeClass.parsingDateTime();
    }

    public static void wrapperClasse() {
        //WrapperClasses.parseExample();
    }

    public static void arrayListClass() {
        //ArrayListClass.addMethodArrayList();
        //ArrayListClass.isEmptySize();
        //ArrayListClass.clearContainsAndEquals();
        //ArrayListClass.convertingBetweenArrayAndList();
        //ArrayListClass.sortingMethod();
    }

    public static void stringBuilderExample() {
        //StringBuilderClass.creatingStringBuilder();
        //StringBuilderClass.stringBuilderMethods();
        // StringBuilderClass.insertMethod();
        StringBuilderClass.understandingEqualityOfStringsAndStringBuilder();
    }

    public static void stringExamples() {
        //StringClass.concatenationExample();
        //StringClass.stringIndexOfMethod();
        //StringClass.substringMethod();
        //StringClass.methodChaining();
        //StringClass.immutableExample();
    }

    public static void initilizingExample() {
        CreatingObject init = new CreatingObject();

    }

    public static void javaOperators() {
        //JavaOperators.operatorsExample();
        //JavaOperators.promotionExample2();
        //JavaOperators.promotionExample();
        //JavaOperators.instanceOfOperator();
        //JavaOperators.equalityOperators();

    }

    public static void javaArrays() {

        JavaArrays.binarySearchExample();

    }

    public static void javaStatements() {
        //JavaStatements.whileStatement();
        //JavaStatements.doWhileStatement();
        //JavaStatements.theBasicForStatement();
        //JavaStatements.nestedForLoop();
        //JavaStatements.advanceFlowControl();
    }

    public static void primitivesExample() {

        prim.printPrimitives();
    }

    public static void variableScopeExample() {
        Variables var = new Variables();
        var.variableScope();
        var.localVariableExample();
    }

}
