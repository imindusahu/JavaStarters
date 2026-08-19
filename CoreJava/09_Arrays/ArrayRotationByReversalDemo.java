/*
 * Topic  : Arrays
 * Program: Array Rotation by Reversal
 * Author : Indu Sahu
 * Purpose: Rotate an array using Reversal Algorithm in Java.
 * Time Complexity: O(n)
 */

public class ArrayRotationByReversalDemo {
    public static void main(String [] args) {
        leftRotationUsingReversal();
        rightRotationUsingReversal();
    }
    private static void reverse(int[] numbers, int start, int end) {
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    private static void leftRotationUsingReversal() {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println("\n========= LEFT ROTATION USING REVERSAL =========\n");

        System.out.println("Before Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        //Step 1 — Reverse the first k elements
        reverse(numbers, 0, k - 1);

        //Step 2 — Reverse the remaining elements
        reverse(numbers, k, numbers.length - 1);

        //Step 3 — Reverse the entire array
        reverse(numbers, 0, numbers.length - 1);

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void rightRotationUsingReversal() {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println("\n\n========= RIGHT ROTATION USING REVERSAL =========\n");

        System.out.println("Before Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        //Step 1 — Reverse the entire array
        reverse(numbers, 0, numbers.length - 1);

        //Step 2 — Reverse the first k elements
        reverse(numbers, 0, k - 1);

        //Step 3 — Reverse the remaining elements
        reverse(numbers, k, numbers.length - 1);

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}