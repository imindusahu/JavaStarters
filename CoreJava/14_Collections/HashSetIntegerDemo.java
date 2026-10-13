/*
 * Topic  : Collections - HashSet
 * Program: HashSetIntegerDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate duplicate handling with Integer values.
 */

import java.util.HashSet;

public class HashSetIntegerDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        // Add numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("HashSet: " + numbers);

        // Check elements
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Contains 50? " + numbers.contains(50));

        // Size
        System.out.println("Size: " + numbers.size());

        // Remove an element
        numbers.remove(20);

        System.out.println("After removing 20: " + numbers);

        // Iterate
        System.out.println("\nElements:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}