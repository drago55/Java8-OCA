//
package main;

import main.chapter_1_java_building_blocks.CreatingObject;
import main.chapter_1_java_building_blocks.ObjectReferanceAndPrimitivs;
import main.chapter_1_java_building_blocks.Variables;
import main.chapter_3_core_java_api.*;

public class Main {

    static ObjectReferanceAndPrimitivs prim = new ObjectReferanceAndPrimitivs();

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

        //initilizingExample();
        //primitivesExample();
        //variableScopeExample();
        //javaOperators();
        //javaStatements();
        //stringExamples();
        //stringBuilderExample();
        //javaArrays();
        //arrayListClass();
        //wrapperClasse();
        javaDateTimeClass();

    }

    public static void javaDateTimeClass() {
        //JavaDateTimeClass.dateTimeExample();
        JavaDateTimeClass.formattingDateTime();
        JavaDateTimeClass.parsingDateTime();
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
