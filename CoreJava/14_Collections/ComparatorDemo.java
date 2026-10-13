/*
 * Topic  : Collections - Comparator
 * Program: ComparatorDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate custom sorting using Comparator.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + "'}";
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Yuvraj"));
        students.add(new Student(101, "Indu"));
        students.add(new Student(102, "Yash"));

        System.out.println("Original List:");
        System.out.println(students);

        // ---------------------------------------
        // 1. Sort by ID - Ascending
        // ---------------------------------------

        Comparator<Student> sortById =
                (s1, s2) -> Integer.compare(s1.id, s2.id);

        Collections.sort(students, sortById);

        System.out.println("\nSorted by ID (Ascending):");
        System.out.println(students);

        // ---------------------------------------
        // 2. Sort by ID - Descending
        // ---------------------------------------

        Comparator<Student> sortByIdDescending =
                (s1, s2) -> Integer.compare(s2.id, s1.id);

        Collections.sort(students, sortByIdDescending);

        System.out.println("\nSorted by ID (Descending):");
        System.out.println(students);

        // ---------------------------------------
        // 3. Sort by Name - Ascending
        // ---------------------------------------

        Comparator<Student> sortByName =
                (s1, s2) -> s1.name.compareTo(s2.name);

        Collections.sort(students, sortByName);

        System.out.println("\nSorted by Name (Ascending):");
        System.out.println(students);

        // ---------------------------------------
        // 4. Sort by Name - Descending
        // ---------------------------------------

        Comparator<Student> sortByNameDescending =
                (s1, s2) -> s2.name.compareTo(s1.name);

        Collections.sort(students, sortByNameDescending);

        System.out.println("\nSorted by Name (Descending):");
        System.out.println(students);
    }
}