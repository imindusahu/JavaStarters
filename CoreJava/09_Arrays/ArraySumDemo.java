/*
 * Topic  : Arrays
 * Program: Array Sum
 * Author : Indu Sahu
 * Purpose: Find the sum of elements of array in Java.
 */

import java.util.Scanner;

public class ArraySumDemo {
    public static void main(String [] args) {
        printArraySum();
    }

    private static void printArraySum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========== ARRAY SUM ==========\n");

        System.out.println("Numbers: ");

        int[] numbers = new int[5]; 
        
        for(int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }

        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        
        System.out.println("\nSum of Array Elements : " + sum);

        scanner.close();
    }
}