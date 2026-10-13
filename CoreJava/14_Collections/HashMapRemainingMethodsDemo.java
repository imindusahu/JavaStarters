/*
 * Topic  : Collections - HashMap Remaining Methods
 * Program: HashMapRemainingMethodsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate important remaining HashMap methods.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapRemainingMethodsDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Indu");
        students.put(102, "Yash");
        students.put(103, "Yuvraj");

        System.out.println("Initial HashMap:");
        System.out.println(students);


        // ==================================================
        // 1. getOrDefault()
        // ==================================================

        String existingStudent =
                students.getOrDefault(101, "Not Found");

        String missingStudent =
                students.getOrDefault(999, "Not Found");

        System.out.println("\n1. getOrDefault()");
        System.out.println("Student 101: " + existingStudent);
        System.out.println("Student 999: " + missingStudent);


        // ==================================================
        // 2. computeIfAbsent()
        // ==================================================

        students.computeIfAbsent(
                104,
                key -> "Samarth"
        );

        System.out.println("\n2. computeIfAbsent()");
        System.out.println(students);

        // Key 101 already exists,
        // so the function will NOT execute.
        students.computeIfAbsent(
                101,
                key -> "Aman"
        );

        System.out.println("After computeIfAbsent() on existing key:");
        System.out.println(students);


        // ==================================================
        // 3. computeIfPresent()
        // ==================================================

        students.computeIfPresent(
                102,
                (key, value) -> value + " Kumar"
        );

        System.out.println("\n3. computeIfPresent()");
        System.out.println(students);

        // Key 999 does not exist,
        // so nothing happens.
        students.computeIfPresent(
                999,
                (key, value) -> "Rahul"
        );

        System.out.println("After computeIfPresent() on missing key:");
        System.out.println(students);


        // ==================================================
        // 4. compute()
        // ==================================================

        students.compute(
                103,
                (key, value) -> value + " Singh"
        );

        System.out.println("\n4. compute()");
        System.out.println(students);

        // compute() can also create a new key.
        students.compute(
                105,
                (key, value) -> "Rohan"
        );

        System.out.println("After compute() with new key:");
        System.out.println(students);


        // ==================================================
        // 5. merge()
        // ==================================================

        students.merge(
                101,
                " Sahu",
                (oldValue, newValue) ->
                        oldValue + newValue
        );

        System.out.println("\n5. merge() on existing key:");
        System.out.println(students);

        // If the key does not exist,
        // merge() simply inserts the value.
        students.merge(
                106,
                "Aman",
                (oldValue, newValue) ->
                        oldValue + newValue
        );

        System.out.println("After merge() with new key:");
        System.out.println(students);


        // ==================================================
        // 6. replaceAll()
        // ==================================================

        students.replaceAll(
                (key, value) ->
                        value.toUpperCase()
        );

        System.out.println("\n6. replaceAll()");
        System.out.println(students);


        // ==================================================
        // 7. keySet()
        // ==================================================

        System.out.println("\n7. keySet()");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }


        // ==================================================
        // 8. values()
        // ==================================================

        System.out.println("\n8. values()");

        for (String value : students.values()) {
            System.out.println(value);
        }


        // ==================================================
        // 9. entrySet()
        // ==================================================

        System.out.println("\n9. entrySet()");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                    + entry.getValue()
            );
        }


        // ==================================================
        // 10. size()
        // ==================================================

        System.out.println("\n10. size()");
        System.out.println("Number of students: "
                + students.size());


        // ==================================================
        // 11. isEmpty()
        // ==================================================

        System.out.println("\n11. isEmpty()");
        System.out.println("Is map empty? "
                + students.isEmpty());


        // ==================================================
        // 12. clear()
        // ==================================================

        students.clear();

        System.out.println("\n12. clear()");
        System.out.println("HashMap after clear(): "
                + students);

        System.out.println("Is map empty now? "
                + students.isEmpty());
    }
}