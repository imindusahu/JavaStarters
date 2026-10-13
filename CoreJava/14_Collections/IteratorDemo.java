/*
 * Topic  : Collections - Iterator
 * Program: IteratorDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate basic Iterator methods.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Indu");
        students.add("Yash");
        students.add("Yuvraj");
        students.add("Samarth");

        System.out.println("ArrayList:");
        System.out.println(students);

        // Create Iterator
        Iterator<String> iterator = students.iterator();

        System.out.println("\nUsing Iterator:");

        while (iterator.hasNext()) {

            String student = iterator.next();

            System.out.println(student);
        }
    }
}