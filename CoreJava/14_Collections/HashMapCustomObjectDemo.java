/*
 * Topic  : Collections - HashMap with Custom Objects
 * Program: HashMapCustomObjectDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate storing custom Student objects
 *          as values in a HashMap.
 */

import java.util.HashMap;
import java.util.Map;

class Student {

    int id;
    String name;
    String branch;

    Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + "'"
                + ", branch='" + branch + "'}";
    }
}

public class HashMapCustomObjectDemo {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        // --------------------------------------------------
        // Add Student objects
        // --------------------------------------------------

        Student s1 = new Student(101, "Indu", "CSE");
        Student s2 = new Student(102, "Yash", "CSE");
        Student s3 = new Student(103, "Yuvraj", "CSE");

        students.put(101, s1);
        students.put(102, s2);
        students.put(103, s3);

        // --------------------------------------------------
        // Duplicate key - existing value gets replaced
        // --------------------------------------------------

        Student s4 = new Student(101, "Aman", "ECE");

        students.put(101, s4);

        System.out.println("After adding another student with ID 101:");
        System.out.println(students);

        System.out.println("Students:");
        System.out.println(students);

        // --------------------------------------------------
        // Get Student using ID
        // --------------------------------------------------

        System.out.println("\nStudent with ID 101:");
        System.out.println(students.get(101));

        // --------------------------------------------------
        // Access individual object fields
        // --------------------------------------------------

        Student student = students.get(102);

        System.out.println("\nStudent with ID 102:");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Branch: " + student.branch);

        // --------------------------------------------------
        // Check whether student exists
        // --------------------------------------------------

        System.out.println("\nContains ID 103? "
                + students.containsKey(103));

        System.out.println("Contains ID 999? "
                + students.containsKey(999));

        // --------------------------------------------------
        // Iterate through Map
        // --------------------------------------------------

        System.out.println("\nAll Students:");

        for (Map.Entry<Integer, Student> entry
                : students.entrySet()) {

            System.out.println(
                    "Key: " + entry.getKey()
                    + " -> "
                    + entry.getValue()
            );
        }
    }
}