/*
 * Topic  : Collections - HashMap putIfAbsent()
 * Program: HashMapPutIfAbsentDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate putIfAbsent() with custom objects.
 */

import java.util.HashMap;

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

public class HashMapPutIfAbsentDemo {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        // Existing students
        Student s1 = new Student(101, "Indu", "CSE");
        Student s2 = new Student(102, "Yash", "CSE");

        students.put(101, s1);
        students.put(102, s2);

        System.out.println("Initial HashMap:");
        System.out.println(students);

        // --------------------------------------------------
        // Try to add another Student using existing key
        // --------------------------------------------------

        Student s3 = new Student(101, "Aman", "ECE");

        students.putIfAbsent(101, s3);

        System.out.println("\nAfter putIfAbsent(101, Aman):");
        System.out.println(students);

        // --------------------------------------------------
        // Add Student using a new key
        // --------------------------------------------------

        Student s4 = new Student(103, "Yuvraj", "CSE");

        students.putIfAbsent(103, s4);

        System.out.println("\nAfter putIfAbsent(103, Yuvraj):");
        System.out.println(students);

        // --------------------------------------------------
        // Get Student with ID 101
        // --------------------------------------------------

        System.out.println("\nStudent with ID 101:");
        System.out.println(students.get(101));
    }
}