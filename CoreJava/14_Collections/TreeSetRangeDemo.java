/*
 * Topic  : Collections - TreeSet
 * Program: TreeSetRangeDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate TreeSet range and ordering methods.
 */

import java.util.TreeSet;

public class TreeSetRangeDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original TreeSet: " + numbers);

        // Elements less than 40
        System.out.println("headSet(40): " + numbers.headSet(40));

        // Elements greater than or equal to 30
        System.out.println("tailSet(30): " + numbers.tailSet(30));

        // Elements from 20 inclusive to 50 exclusive
        System.out.println("subSet(20, 50): " + numbers.subSet(20, 50));

        // Reverse order
        System.out.println("descendingSet(): " + numbers.descendingSet());
    }
}