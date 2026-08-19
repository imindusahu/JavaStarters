/*
 * Topic  : Arrays
 * Program: Delete Element
 * Author : Indu Sahu
 * Purpose: To delete a element at a specific position in Java.
 */

public class DeleteElementDemo {
    public static void main(String [] args) {
        deleteElement();
    }

    private static void deleteElement() {
        int[] numbers = {10, 20, 30, 40, 50};
        int position = 2;

        int[] newNumbers = new int[numbers.length - 1];

        System.out.println("\n========= DELETE ELEMENT ==========\n");
        System.out.println("Original Array: ");

        // print Original array
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        // Copy elements before the deletion position
        for(int i = 0; i < position; i++) {
            newNumbers[i] = numbers[i];
        }

        // Shift the remaining elements left
        for(int i = position; i < numbers.length - 1; i++) {
            newNumbers[i] = numbers[i + 1];
        }

        System.out.println("\n\nArray after deletion: ");

        //  print array after deletion
        for(int number : newNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}