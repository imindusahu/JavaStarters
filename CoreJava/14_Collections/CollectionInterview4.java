/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview4
 * Author : Indu Sahu
 * Purpose: Sort students by marks descending, then
 *          by name alphabetically using Comparator.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class CollectionInterview4 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Indu", 85));
        students.add(new Student("Yash", 92));
        students.add(new Student("Aman", 85));
        students.add(new Student("Priya", 96));
        students.add(new Student("Riya", 92));

        students.sort(
            Comparator.comparingInt((Student s) -> s.marks)
                      .reversed()
                      .thenComparing(s -> s.name)
        );

        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}