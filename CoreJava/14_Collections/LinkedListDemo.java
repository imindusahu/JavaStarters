/*
 * Topic  : Collections - LinkedList
 * Program: LinkedListDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate basic LinkedList operations.
 */

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // 1. Add elements
        names.add("Indu");
        names.add("Yash");
        names.add("Yuvraj");

        System.out.println("Initial LinkedList: " + names);

        // 2. Add element at the beginning
        names.addFirst("Samarth");

        System.out.println("After addFirst(): " + names);

        // 3. Add element at the end
        names.addLast("Rahul");

        System.out.println("After addLast(): " + names);

        // 4. Get first element
        System.out.println("First element: " + names.getFirst());

        // 5. Get last element
        System.out.println("Last element: " + names.getLast());

        // 6. Get element using index
        System.out.println("Element at index 2: " + names.get(2));

        // 7. Update an element
        names.set(2, "Aman");

        System.out.println("After set(): " + names);

        // 8. Remove first element
        names.removeFirst();

        System.out.println("After removeFirst(): " + names);

        // 9. Remove last element
        names.removeLast();

        System.out.println("After removeLast(): " + names);

        // 10. Check whether element exists
        System.out.println("Contains Yash? " + names.contains("Yash"));

        // 11. Display size
        System.out.println("Size: " + names.size());

        // 12. Iterate through LinkedList
        System.out.println("\nUsing enhanced for loop:");

        for (String name : names) {
            System.out.println(name);
        }

        // 13. Clear the list
        names.clear();

        System.out.println("\nAfter clear(): " + names);

        // 14. Check whether list is empty
        System.out.println("Is list empty? " + names.isEmpty());
    }
}