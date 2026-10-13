/*
 * Topic  : Collections - Iterator remove()
 * Program: IteratorRemoveDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate safe removal using Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Indu");
        students.add("Yash");
        students.add("Yuvraj");
        students.add("Samarth");

        System.out.println("Initial ArrayList:");
        System.out.println(students);

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {

            String student = iterator.next();

            if (student.equals("Yuvraj")) {

                iterator.remove();

                System.out.println(
                        "\nRemoved: " + student
                );
            }
        }

        System.out.println("\nFinal ArrayList:");
        System.out.println(students);
    }
}