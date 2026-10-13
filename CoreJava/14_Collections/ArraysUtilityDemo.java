/*
 * Topic  : Arrays - Utility Class
 * Program: ArraysUtilityDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate important methods of
 *          the java.util.Arrays utility class.
 */

import java.util.Arrays;

public class ArraysUtilityDemo {

    public static void main(String[] args) {

        // 1. sort()
        int[] numbers = {40, 10, 30, 20, 50};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("\n1. sort():");
        System.out.println(Arrays.toString(numbers));


        // 2. binarySearch()
        int index = Arrays.binarySearch(numbers, 30);

        System.out.println("\n2. binarySearch():");
        System.out.println("Index of 30: " + index);


        // Binary search for missing element
        int missingIndex = Arrays.binarySearch(numbers, 35);

        System.out.println("Index of 35: " + missingIndex);


        // 3. copyOf()
        int[] copiedArray = Arrays.copyOf(numbers, 7);

        System.out.println("\n3. copyOf():");
        System.out.println(Arrays.toString(copiedArray));


        // 4. copyOfRange()
        int[] rangeArray = Arrays.copyOfRange(numbers, 1, 4);

        System.out.println("\n4. copyOfRange():");
        System.out.println(Arrays.toString(rangeArray));


        // 5. equals()
        int[] firstArray = {10, 20, 30};
        int[] secondArray = {10, 20, 30};
        int[] thirdArray = {10, 20, 40};

        System.out.println("\n5. equals():");

        System.out.println(
                "firstArray equals secondArray: "
                        + Arrays.equals(firstArray, secondArray)
        );

        System.out.println(
                "firstArray equals thirdArray: "
                        + Arrays.equals(firstArray, thirdArray)
        );


        // 6. fill()
        int[] values = new int[5];

        Arrays.fill(values, 100);

        System.out.println("\n6. fill():");
        System.out.println(Arrays.toString(values));


        // 7. toString()
        int[] marks = {85, 90, 78, 92};

        System.out.println("\n7. toString():");
        System.out.println(Arrays.toString(marks));
    }
}