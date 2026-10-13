/*
 * Topic  : Collections - Comparable
 * Program: ComparableDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate natural ordering using Comparable.
 */

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {

        return other.id - this.id;
    }

    @Override
    public String toString() {

        return "Student{id=" + id
                + ", name='" + name + "'}";
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Yuvraj"));
        students.add(new Student(101, "Indu"));
        students.add(new Student(102, "Yash"));

        System.out.println("Before sorting:");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("\nAfter sorting by ID:");
        System.out.println(students);
    }
}