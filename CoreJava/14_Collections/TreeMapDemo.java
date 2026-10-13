/*
 * Topic  : Collections - TreeMap
 * Program: TreeMapDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate TreeMap and sorted key order.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // Add entries in an unsorted order
        students.put(103, "Yuvraj");
        students.put(101, "Indu");
        students.put(104, "Samarth");
        students.put(102, "Yash");

        System.out.println("TreeMap: " + students);

        // Get value
        System.out.println("Value for key 101: "
                + students.get(101));

        // Check key
        System.out.println("Contains key 102? "
                + students.containsKey(102));

        // First and last keys
        System.out.println("First key: "
                + students.firstKey());

        System.out.println("Last key: "
                + students.lastKey());

        // Navigation methods
        System.out.println("\nReference key: 102");

        System.out.println("lowerKey(102): "
                + students.lowerKey(102));

        System.out.println("floorKey(102): "
                + students.floorKey(102));

        System.out.println("higherKey(102): "
                + students.higherKey(102));

        System.out.println("ceilingKey(102): "
                + students.ceilingKey(102));

        // Remove
        students.remove(103);

        System.out.println("\nAfter removing key 103: "
                + students);

        // Iterate
        System.out.println("\nEntries in sorted key order:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}