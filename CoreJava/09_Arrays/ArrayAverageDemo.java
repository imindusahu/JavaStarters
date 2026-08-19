/*
 * Topic  : Arrays
 * Program: Array Average
 * Author : Indu Sahu
 * Purpose: Find the average of array elements in Java.
 */

import java.util.Scanner;

public class ArrayAverageDemo {
    public static void main(String [] args) {
        calculateAverage();
    }

    private static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========== ARRAY AVERAGE ============\n");

        System.out.println("Numbers:");
        int[] numbers = new int[5];

        for(int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }

        
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum of Array Elements : " + sum);

        double average = (double) sum / numbers.length;

        System.out.println("Average of Array Elements : " + average);

        scanner.close();
    }
}