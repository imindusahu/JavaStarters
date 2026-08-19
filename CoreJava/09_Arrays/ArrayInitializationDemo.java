/*
 * Topic  : Arrays
 * Program: Array Initialization
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and initialization of arrays in Java.
 */

public class ArrayInitializationDemo {
    public static void main(String [] args) {
        printArrayInitialization();
    }

    private static void printArrayInitialization() {
        // Initialize directly
        int[] numbers0 = new int[]{10, 20, 30};  // this is also correct way 
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n==========  ARRAY INITIALIZATION =========\n");

        System.out.println("First Element   : " + numbers[0]);
        System.out.println("Second Element  : " + numbers[1]);
        System.out.println("Third Element   : " + numbers[2]);
        System.out.println("Fourth Element  : " + numbers[3]);
        System.out.println("Fifth Element   : " + numbers[4]);

    }
}