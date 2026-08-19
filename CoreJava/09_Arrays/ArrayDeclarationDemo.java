/*
 * Topic  : Arrays
 * Program: Array Declaration
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and declaration of arrays in Java.
 */

public class ArrayDeclarationDemo {
    public static void main(String [] args) {
        printArrayDeclaration();
    }

    private static void printArrayDeclaration() {
        // Array declaration
        int[] numbers = new int[5];
        int marks[] = new int[3];
        String[] names = new String[4];

        System.out.println("\n========= ARRAY DECLARATION ==========\n");

        // Length = Total number of elements
        // LastIndex = ArrayLength - 1
        System.out.println("Length of Numbers Array : " + numbers.length);
        System.out.println("Length of Marks Array : " + marks.length);
        System.out.println("Length of Names Array : " + names.length);

    }
}