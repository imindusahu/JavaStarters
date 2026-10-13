/*
 * Topic  : Collections - HashMap Iteration
 * Program: HashMapIterationDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate different ways to iterate through a HashMap.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Indu");
        students.put(102, "Yash");
        students.put(103, "Yuvraj");
        students.put(104, "Samarth");

        // --------------------------------------------------
        // 1. Iterate using keySet()
        // --------------------------------------------------

        System.out.println("Using keySet():");

        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        // --------------------------------------------------
        // 2. Iterate using values()
        // --------------------------------------------------

        System.out.println("\nUsing values():");

        for (String name : students.values()) {
            System.out.println(name);
        }

        // --------------------------------------------------
        // 3. Iterate using keySet() + get()
        // --------------------------------------------------

        System.out.println("\nUsing keySet() + get():");

        for (Integer id : students.keySet()) {
            System.out.println(id + " -> " + students.get(id));
        }

        // --------------------------------------------------
        // 4. Iterate using entrySet()
        // --------------------------------------------------

        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}