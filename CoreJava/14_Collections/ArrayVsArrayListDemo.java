/*
 * Topic  : Collections
 * Program: ArrayVsArrayListDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate the basic difference between arrays and ArrayList.
 */

import java.util.ArrayList;

public class ArrayVsArrayListDemo {

    public static void main(String[] args) {

        // Array
        int[] numbers = {10, 20, 30};

        System.out.println("Array:");

        for (int number : numbers) {
            System.out.println(number);
        }

        // ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        System.out.println("\nArrayList:");

        for (int number : numberList) {
            System.out.println(number);
        }
    }
}