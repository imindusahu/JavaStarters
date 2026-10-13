/*
 * Topic  : Collections - HashMap Methods
 * Program: HashMapMethodsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate commonly used HashMap methods.
 */

import java.util.HashMap;

public class HashMapMethodsDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // --------------------------------------------------
        // 1. put() - Add key-value pairs
        // --------------------------------------------------

        students.put(101, "Indu");
        students.put(102, "Yash");
        students.put(103, "Yuvraj");

        System.out.println("Initial HashMap: " + students);

        // --------------------------------------------------
        // 2. put() with existing key - Updates the value
        // --------------------------------------------------

        students.put(102, "Samarth");

        System.out.println("After updating key 102: " + students);

        // --------------------------------------------------
        // 3. putIfAbsent() - Add only if key doesn't exist
        // --------------------------------------------------

        students.putIfAbsent(102, "Rahul");
        students.putIfAbsent(104, "Rahul");

        System.out.println("After putIfAbsent(): " + students);

        // --------------------------------------------------
        // 4. get() - Get value using key
        // --------------------------------------------------

        System.out.println("Value for key 101: "
                + students.get(101));

        // --------------------------------------------------
        // 5. get() with missing key
        // --------------------------------------------------

        System.out.println("Value for key 999: "
                + students.get(999));

        // --------------------------------------------------
        // 6. getOrDefault() - Return default if key missing
        // --------------------------------------------------

        System.out.println("Value for key 999: "
                + students.getOrDefault(999, "Not Found"));

        // --------------------------------------------------
        // 7. containsKey()
        // --------------------------------------------------

        System.out.println("Contains key 103? "
                + students.containsKey(103));

        // --------------------------------------------------
        // 8. containsValue()
        // --------------------------------------------------

        System.out.println("Contains value Indu? "
                + students.containsValue("Indu"));

        // --------------------------------------------------
        // 9. replace() - Replace value for existing key
        // --------------------------------------------------

        students.replace(103, "Aman");

        System.out.println("After replace(): " + students);

        // --------------------------------------------------
        // 10. remove()
        // --------------------------------------------------

        students.remove(104);

        System.out.println("After remove(104): " + students);

        // --------------------------------------------------
        // 11. size()
        // --------------------------------------------------

        System.out.println("Size: " + students.size());

        // --------------------------------------------------
        // 12. isEmpty()
        // --------------------------------------------------

        System.out.println("Is HashMap empty? "
                + students.isEmpty());

        // --------------------------------------------------
        // 13. keySet() - Get all keys
        // --------------------------------------------------

        System.out.println("Keys: " + students.keySet());

        // --------------------------------------------------
        // 14. values() - Get all values
        // --------------------------------------------------

        System.out.println("Values: " + students.values());

        // --------------------------------------------------
        // 15. entrySet() - Get key-value entries
        // --------------------------------------------------

        System.out.println("Entries: " + students.entrySet());

        // --------------------------------------------------
        // 16. clear() - Remove everything
        // --------------------------------------------------

        students.clear();

        System.out.println("After clear(): " + students);
        System.out.println("Is HashMap empty now? "
                + students.isEmpty());
    }
}