/*
 * Topic  : Collections - HashMap
 * Program: HashMapDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate basic HashMap operations.
 */

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Indu");
        students.put(102, "Yash");
        students.put(103, "Yuvraj");

        System.out.println("HashMap: " + students);

        // Get value using key
        System.out.println("Student with ID 101: " + students.get(101));

        // Check whether key exists
        System.out.println("Contains key 102? "
                + students.containsKey(102));

        // Check whether value exists
        System.out.println("Contains value Yuvraj? "
                + students.containsValue("Yuvraj"));

        // Size
        System.out.println("Size: " + students.size());

        // Remove using key
        students.remove(102);

        System.out.println("After removing ID 102: " + students);
    }
}