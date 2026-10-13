/*
 * Topic  : Collections - ArrayList
 * Program: ArrayListMethodsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate commonly used ArrayList methods.
 */

import java.util.ArrayList;

public class ArrayListMethodsDemo {

    public static void main(String[] args) {

        // ============================================================
        // 1. Creating an ArrayList
        // ============================================================

        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("Initial ArrayList: " + fruits);


        // ============================================================
        // 2. add() - Add elements
        // ============================================================

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\nAfter add(): " + fruits);


        // ============================================================
        // 3. add(index, element) - Add at a specific position
        // ============================================================

        fruits.add(1, "Orange");

        System.out.println("After add(index, element): " + fruits);


        // ============================================================
        // 4. get(index) - Get an element
        // ============================================================

        String fruit = fruits.get(2);

        System.out.println("Element at index 2: " + fruit);


        // ============================================================
        // 5. set(index, element) - Update an element
        // ============================================================

        fruits.set(2, "Grapes");

        System.out.println("After set(): " + fruits);


        // ============================================================
        // 6. size() - Get number of elements
        // ============================================================

        System.out.println("Size: " + fruits.size());


        // ============================================================
        // 7. contains() - Check whether an element exists
        // ============================================================

        System.out.println("Contains Apple? "
                + fruits.contains("Apple"));

        System.out.println("Contains Watermelon? "
                + fruits.contains("Watermelon"));


        // ============================================================
        // 8. indexOf() - Find first occurrence
        // ============================================================

        System.out.println("Index of Banana: "
                + fruits.indexOf("Banana"));


        // ============================================================
        // 9. lastIndexOf() - Find last occurrence
        // ============================================================

        fruits.add("Apple");

        System.out.println("After adding Apple again: " + fruits);

        System.out.println("Last index of Apple: "
                + fruits.lastIndexOf("Apple"));


        // ============================================================
        // 10. remove(index) - Remove by index
        // ============================================================

        fruits.remove(1);

        System.out.println("After remove(index): " + fruits);


        // ============================================================
        // 11. remove(object) - Remove by value
        // ============================================================

        fruits.remove("Apple");

        System.out.println("After remove(object): " + fruits);


        // ============================================================
        // 12. isEmpty() - Check whether list is empty
        // ============================================================

        System.out.println("Is list empty? "
                + fruits.isEmpty());


        // ============================================================
        // 13. Iterating using enhanced for loop
        // ============================================================

        System.out.println("\nUsing enhanced for loop:");

        for (String item : fruits) {
            System.out.println(item);
        }


        // ============================================================
        // 14. Iterating using traditional for loop
        // ============================================================

        System.out.println("\nUsing traditional for loop:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(
                    "Index " + i + ": " + fruits.get(i)
            );
        }


        // ============================================================
        // 15. clear() - Remove all elements
        // ============================================================

        fruits.clear();

        System.out.println("\nAfter clear(): " + fruits);


        // ============================================================
        // 16. isEmpty() after clear()
        // ============================================================

        System.out.println("Is list empty now? "
                + fruits.isEmpty());
    }
}