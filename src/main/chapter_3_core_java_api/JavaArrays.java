package main.chapter_3_core_java_api;

import java.util.Arrays;

public class JavaArrays {

    /*
        type of array int  array symbol->[]  size of array [5]
                    int [ ] num =new int[5];
        array is an order list and it can contain duplicated values

     */
    private static void print(Object o) {
        System.out.println(o); //helper method for printing
    }

    public static void createArray() {

        /*
            Empty array
         */
        int[] num = new int[5];
        //creates array of five integers with default value of 0 index are from 0 to 4

        /*
            Initialized array
         */
        int[] num2 = new int[]{22, 3, 56, 121, 212}; //creates array with defined values
        //anonymous array because you don't specify type and size
        int[] num3 = {1, 2, 3};
        //valid array declaration
        int[] a;
        int [] a2;
        int a3[];
        int a4 [];

        int[] a5, b5; //creates two arrays

        int a6[], b6; //creates array and int

        //Creating array with reference
        String[] number = {"one, two, three"};

        /*
            array index pointing to 0->"one"  1->"two" 2->"three"
         */


        String[] referance = number;
        print(number.equals(referance));

    }

    public static void usingArray() {

        String[] number = {"one, two, three"};
        print(number.length); // length give us how many slots are allocated
        print(number[0]); //prints first value of array

        /*
            It's very common to use loop when reading and writing to array
            number.length give us 3 but since i<3 loop executes only 0 , 1, 2 since 3 < 3 false and
            ArrayIndexOutOfBoundsException is never thrown

         */
        String[] number2 = new String[3];

        for (int i = 0; i < number.length; i++) {
            String s = number[i];
            print(s);
            number2[i] = s; //we are saving values from one array to another with loop
        }

    }

    public static void sortingExample() {
        /*
            Java provides Arrays class to sort any array with method Arrays.sort()
            we need to import it in order to use Arrays class
            import java.util.*; //imports all class from util package including Arrays class
            import java.util.Arrays; imports Arrays class
         */

        int[] numbers = {1, 93, 4, 5, 2, 7, 3, 10};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            print(numbers[i]);
        }
        String [] strings={"10","13","5","8","1"};
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            print(strings[i]);

        }
    }

    public static void binarySearchExample(){
        /*
            If target element is found in sorted array it returns index of matched element

            If element is not found in sorted array negative value showing one smaller than the negative of index
            if it should be on index 3 it will negate -3 and -1 and will show -4

            If unsorted array this result isn't predictable
         */

        int[] num={3,6,9,12,15};

        print(Arrays.binarySearch(num,2)); // 2 should be before 3 in array that is on index 0 since there is all ready a value on 0 java subtracts
        print(Arrays.binarySearch(num,3)); //It will print 0 since it willl be found at first index
    }


}
