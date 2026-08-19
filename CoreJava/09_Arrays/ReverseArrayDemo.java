/*
 * Topic  : Arrays
 * Program: Reverse Array
 * Author : Indu Sahu
 * Purpose: Print the reverse elements of an array in Java.
 */

public class ReverseArrayDemo {
    public static void main(String [] args) {
        printReverseElement();
        printReverseArrayInPlace();
        printReverseArrayTwoPointer();
    }

    private static void printReverseElement() {
        System.out.println("\n========== REVERSE ARRAY ===========\n");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: ");
        for(int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }

        System.out.println("\n\nReverse Array: ");
        for(int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();
    }

    // In-place describes how the array is modified.
    private static void printReverseArrayInPlace() {
        
        int[] numbers = {10, 20, 30, 40, 50};

        int i = 0;
        int j = numbers.length - 1;

        System.out.println("\n\n========= REVERSE ARRAY IN-PLACE ==========\n");

        System.out.println("\nOriginal Element: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        while(i < j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

            i++;
            j--;
        }

        System.out.println("\n\nReverse Element: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Two-pointer describes the technique used to solve the problem.
    private static void printReverseArrayTwoPointer() {
        
        int[] numbers = {10, 20, 30, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        System.out.println("\n\n========= REVERSE ARRAY Two Pointer ==========\n");

        System.out.println("\nOriginal Element: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        while(left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("\n\nReverse Element: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}