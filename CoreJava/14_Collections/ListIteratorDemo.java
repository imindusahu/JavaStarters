/*
 * Topic  : Collections - ListIterator
 * Program: ListIteratorDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate forward and backward traversal.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Indu");
        students.add("Yash");
        students.add("Yuvraj");
        students.add("Samarth");

        System.out.println("ArrayList:");
        System.out.println(students);

        ListIterator<String> iterator =
                students.listIterator();

        // ---------------------------------------------
        // Forward traversal
        // ---------------------------------------------

        System.out.println("\nForward traversal:");

        while (iterator.hasNext()) {

            String student = iterator.next();

            System.out.println(student);
        }

        // ---------------------------------------------
        // Backward traversal
        // ---------------------------------------------

        System.out.println("\nBackward traversal:");

        while (iterator.hasPrevious()) {

            String student = iterator.previous();

            System.out.println(student);
        }
    }
}