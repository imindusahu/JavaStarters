/*
 * Topic  : Collections - Utility Class
 * Program: CollectionsUtilityDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate important methods of the
 *          java.util.Collections utility class.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Original List:");
        System.out.println(numbers);

        // 1. sort()
        Collections.sort(numbers);

        System.out.println("\n1. sort():");
        System.out.println(numbers);

        // 2. reverse()
        Collections.reverse(numbers);

        System.out.println("\n2. reverse():");
        System.out.println(numbers);

        // 3. shuffle()
        Collections.shuffle(numbers);

        System.out.println("\n3. shuffle():");
        System.out.println(numbers);

        // 4. max()
        int maximum = Collections.max(numbers);

        System.out.println("\n4. max():");
        System.out.println(maximum);

        // 5. min()
        int minimum = Collections.min(numbers);

        System.out.println("\n5. min():");
        System.out.println(minimum);

        // 6. frequency()
        numbers.add(30);
        numbers.add(30);

        int count = Collections.frequency(numbers, 30);

        System.out.println("\n6. frequency():");
        System.out.println("30 occurs " + count + " times");

        // 7. swap()
        Collections.swap(numbers, 0, 1);

        System.out.println("\n7. swap():");
        System.out.println(numbers);

        // 8. fill()
        ArrayList<String> names = new ArrayList<>();

        names.add("Indu");
        names.add("Yash");
        names.add("Aman");
        names.add("Yuvraj");

        System.out.println("\n8. Before fill():");
        System.out.println(names);

        Collections.fill(names, "Student");

        System.out.println("After fill():");
        System.out.println(names);

        // 9. binarySearch()
        ArrayList<Integer> sortedNumbers = new ArrayList<>();

        sortedNumbers.add(10);
        sortedNumbers.add(20);
        sortedNumbers.add(30);
        sortedNumbers.add(40);
        sortedNumbers.add(50);

        int index = Collections.binarySearch(sortedNumbers, 30);

        System.out.println("\n9. binarySearch():");
        System.out.println("Index of 30: " + index);

        // 10. binarySearch() for missing element
        int missingIndex = Collections.binarySearch(sortedNumbers, 35);

        System.out.println("Index of 35: " + missingIndex);
    }
}