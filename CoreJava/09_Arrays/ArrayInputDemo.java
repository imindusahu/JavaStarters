/*
 * Topic  : Array Input
 * Program: Array Access
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept of user input and access of elements of arrays in Java.
 */

import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String [] args) {
        readArrayInput();
    }

    private static void readArrayInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========= ARRAY INPUT ==========\n");

        System.out.print("Enter number of elements : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("Enter Element " + (index + 1)+ " : ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("\n======== ARRAY ELEMENTS ==========\n");

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}