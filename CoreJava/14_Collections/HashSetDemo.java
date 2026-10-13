/*
 * Topic  : Collections - HashSet
 * Program: HashSetDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate HashSet and duplicate handling.
 */

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> names = new HashSet<>();

        // 1. Add elements
        names.add("Indu");
        names.add("Yash");
        names.add("Yuvraj");

        System.out.println("Initial HashSet: " + names);

        // 2. Add duplicate element
        names.add("Indu");

        System.out.println("After adding duplicate Indu: " + names);

        // 3. Add another element
        names.add("Samarth");

        System.out.println("After adding Samarth: " + names);

        // 4. Check whether an element exists
        System.out.println("Contains Yash? " + names.contains("Yash"));

        System.out.println("Contains Rahul? " + names.contains("Rahul"));

        // 5. Remove an element
        names.remove("Yuvraj");

        System.out.println("After removing Yuvraj: " + names);

        // 6. Display size
        System.out.println("Size: " + names.size());

        // 7. Iterate through HashSet
        System.out.println("\nUsing enhanced for loop:");

        for (String name : names) {
            System.out.println(name);
        }

        // 8. Check whether HashSet is empty
        System.out.println("\nIs HashSet empty? " + names.isEmpty());

        // 9. Clear HashSet
        names.clear();

        System.out.println("After clear(): " + names);

        System.out.println("Is HashSet empty now? " + names.isEmpty());
    }
}