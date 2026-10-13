/*
 * Topic  : Collections - TreeSet
 * Program: TreeSetDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate TreeSet and automatic sorting.
 */

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements in random order
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("TreeSet: " + numbers);

        // Add duplicate
        boolean added = numbers.add(30);

        System.out.println("Was duplicate 30 added? " + added);
        System.out.println("After duplicate attempt: " + numbers);

        // First and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Check elements
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Contains 100? " + numbers.contains(100));

        // Remove element
        numbers.remove(30);

        System.out.println("After removing 30: " + numbers);

        // Size
        System.out.println("Size: " + numbers.size());

        // Iterate
        System.out.println("\nElements in sorted order:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}