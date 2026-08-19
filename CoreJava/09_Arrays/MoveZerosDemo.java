/*
 * Topic  : Arrays
 * Program: Move Zeros to End
 * Author : Indu Sahu
 * Purpose: Move all zero elements to the end of an array.
 * Complexity: Time  : O(n) and Space : O(1)
 * Algorithm: In-place array manipulation pattern
 */

public class MoveZerosDemo {

    public static void main(String[] args) {
        moveZerosToEnd();
    }

    private static void moveZerosToEnd() {

        int[] numbers = {0, 10, 0, 20, 30, 0, 40};

        System.out.println("\n========== MOVE ZEROS TO END ==========\n");

        System.out.println("Original Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int index = 0;

        // Move non-zero elements to the front
        for (int number : numbers) {

            if (number != 0) {
                numbers[index] = number;
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("\n\nArray After Moving Zeros: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}