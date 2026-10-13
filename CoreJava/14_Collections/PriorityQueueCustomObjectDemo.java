/*
 * Topic  : Collections - PriorityQueue with Objects
 * Program: PriorityQueueCustomObjectDemo
 * Author : Indu Sahu
 * Purpose: Process students in descending order
 *          of marks using a custom Comparator.
 */

import java.util.Comparator;
import java.util.PriorityQueue;

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

public class PriorityQueueCustomObjectDemo {

    public static void main(String[] args) {

        PriorityQueue<Student> students =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                (Student s) -> s.marks
                        ).reversed()
                );

        students.offer(new Student("Indu", 85));
        students.offer(new Student("Yash", 92));
        students.offer(new Student("Aman", 78));
        students.offer(new Student("Priya", 96));

        System.out.println("Students by highest marks first:");

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}