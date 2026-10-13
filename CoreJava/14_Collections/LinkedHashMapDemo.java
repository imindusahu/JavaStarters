/*
 * Topic  : Collections - LinkedHashMap
 * Program: LinkedHashMapDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate LinkedHashMap and insertion order.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        // Add entries
        students.put(103, "Yuvraj");
        students.put(101, "Indu");
        students.put(104, "Samarth");
        students.put(102, "Yash");

        System.out.println("LinkedHashMap: " + students);

        // Get value
        System.out.println("Value for key 101: "
                + students.get(101));

        // Check key
        System.out.println("Contains key 102? "
                + students.containsKey(102));

        // Remove
        students.remove(104);

        System.out.println("After removing key 104: "
                + students);

        // Iterate
        System.out.println("\nEntries in insertion order:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}