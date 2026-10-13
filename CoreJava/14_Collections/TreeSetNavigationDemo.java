/*
 * Topic  : Collections - TreeSet
 * Program: TreeSetNavigationDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate TreeSet navigation methods.
 */

import java.util.TreeSet;

public class TreeSetNavigationDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("TreeSet: " + numbers);

        // Navigation methods
        System.out.println("\nReference value: 30");

        System.out.println("lower(30): " + numbers.lower(30));
        System.out.println("floor(30): " + numbers.floor(30));
        System.out.println("higher(30): " + numbers.higher(30));
        System.out.println("ceiling(30): " + numbers.ceiling(30));

        // Test a value that does not exist
        System.out.println("\nReference value: 35");

        System.out.println("lower(35): " + numbers.lower(35));
        System.out.println("floor(35): " + numbers.floor(35));
        System.out.println("higher(35): " + numbers.higher(35));
        System.out.println("ceiling(35): " + numbers.ceiling(35));
    }
}