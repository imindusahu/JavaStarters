/*
 * Topic  : Collections - LinkedHashSet
 * Program: LinkedHashSetDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate uniqueness and insertion order.
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        // Add elements
        names.add("Indu");
        names.add("Yash");
        names.add("Yuvraj");
        names.add("Samarth");

        System.out.println("Initial LinkedHashSet: " + names);

        // Add duplicate
        boolean added = names.add("Indu");

        System.out.println("Was duplicate Indu added? " + added);
        System.out.println("After duplicate attempt: " + names);

        // Add another element
        names.add("Rahul");

        System.out.println("After adding Rahul: " + names);

        // Check element
        System.out.println("Contains Yash? " + names.contains("Yash"));

        // Remove element
        names.remove("Yuvraj");

        System.out.println("After removing Yuvraj: " + names);

        // Size
        System.out.println("Size: " + names.size());

        // Iterate
        System.out.println("\nElements in insertion order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}