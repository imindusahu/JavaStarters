/*
 * Topic  : Collections - ListIterator Methods
 * Program: ListIteratorMethodsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate add(), set(), and remove().
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethodsDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Indu");
        students.add("Yash");
        students.add("Yuvraj");
        students.add("Samarth");

        System.out.println("Initial ArrayList:");
        System.out.println(students);

        ListIterator<String> iterator =
                students.listIterator();

        // --------------------------------------------------
        // 1. set()
        // --------------------------------------------------

        while (iterator.hasNext()) {

            String student = iterator.next();

            if (student.equals("Yash")) {

                iterator.set("Aman");
            }
        }

        System.out.println("\nAfter set(Yash -> Aman):");
        System.out.println(students);


        // --------------------------------------------------
        // 2. add()
        // --------------------------------------------------

        iterator = students.listIterator();

        while (iterator.hasNext()) {

            String student = iterator.next();

            if (student.equals("Yuvraj")) {

                iterator.add("Rahul");

                break;
            }
        }

        System.out.println("\nAfter add(Rahul):");
        System.out.println(students);


        // --------------------------------------------------
        // 3. remove()
        // --------------------------------------------------

        iterator = students.listIterator();

        while (iterator.hasNext()) {

            String student = iterator.next();

            if (student.equals("Aman")) {

                iterator.remove();

                break;
            }
        }

        System.out.println("\nAfter remove(Aman):");
        System.out.println(students);
    }
}