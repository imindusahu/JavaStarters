/*
 * Topic  : Arrays
 * Program: Array Traversal
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and traversal of arrays in Java.
 */

public class ArrayTraversalDemo {
    public static void main(String [] args) {
        printArrayTraversal();
    }

    private static void printArrayTraversal() {
        System.out.println("\n========== ARRAY TRAVERSAL ===========\n");

        int[] numbers = {10, 20, 30, 40, 50};

        for(int index = 0; index < numbers.length; index++) {
            System.out.println("Element at index " + index + " : " + numbers[index]);
        }
    }
}