/*
 * Topic  : Collections - ArrayList
 * Program: ArrayListUserInputDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate ArrayList with user input.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInputDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        // ============================================================
        // 1. Take names from the user
        // ============================================================

        System.out.print("How many names do you want to add? ");
        int count = scanner.nextInt();

        scanner.nextLine(); // Consume leftover newline

        for (int i = 0; i < count; i++) {

            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();

            names.add(name);
        }


        // ============================================================
        // 2. Display all names
        // ============================================================

        System.out.println("\nNames:");

        for (String name : names) {
            System.out.println(name);
        }


        // ============================================================
        // 3. Search for a name
        // ============================================================

        System.out.print("\nEnter a name to search: ");
        String searchName = scanner.nextLine();

        if (names.contains(searchName)) {

            System.out.println(
                    searchName + " found in the list");

        } else {

            System.out.println(
                    searchName + " not found in the list");
        }


        // ============================================================
        // 4. Remove a name
        // ============================================================

        System.out.print("\nEnter a name to remove: ");
        String removeName = scanner.nextLine();

        if (names.remove(removeName)) {

            System.out.println(
                    removeName + " removed successfully");

        } else {

            System.out.println(
                    removeName + " was not found");
        }


        // ============================================================
        // 5. Display final list
        // ============================================================

        System.out.println("\nFinal list:");

        for (String name : names) {
            System.out.println(name);
        }


        // ============================================================
        // 6. Display list size
        // ============================================================

        System.out.println("\nTotal names: " + names.size());

        scanner.close();
    }
}