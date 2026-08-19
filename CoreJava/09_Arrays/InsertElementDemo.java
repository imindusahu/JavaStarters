/*
 * Topic  : Arrays
 * Program: Insert Element
 * Author : Indu Sahu
 * Purpose: To insert a new element at a specific position in Java.
 */

public class InsertElementDemo {
    public static void main(String [] args) {
        insertElement();
    }

    private static void insertElement() {
        int[] numbers = {10, 20, 30, 40, 50};
        int position = 2;
        int value = 25;

        int[] newNumbers = new int[numbers.length + 1];

        System.out.println("\n========= INSERT ELEMENT ==========\n");
        System.out.println("Original Array: ");

        // print Original array
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        // Copy elements before the insertion position
        for(int i = 0; i < position; i++) {
            newNumbers[i] = numbers[i];
        }

        // Shift the remaining elements right
        for(int i = numbers.length - 1; i >= position; i--) {
            newNumbers[i + 1] = numbers[i];
        }

        // Insert the new value
        newNumbers[position] = value;

        System.out.println("\n\nArray after insertion: ");

        //  print array after insertion
        for(int number : newNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}