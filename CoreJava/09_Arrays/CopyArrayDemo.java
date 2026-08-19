/*
 * Topic  : Arrays
 * Program: Copy Array
 * Author : Indu Sahu
 * Purpose: To create a new array containing the same elements in Java.
 */

public class CopyArrayDemo {
    public static void main(String [] args) {
        toCreateCopyOfArray();
    }

    private static void toCreateCopyOfArray() {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] copiedNumbers = new int[numbers.length];

        System.out.println("\n======== COPY ARRAY ========\n");

        System.out.println("Copied Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        for(int index = 0; index < numbers.length; index++) {
            copiedNumbers[index] = numbers[index];
        }


        System.out.println("\nCopied Array: ");
        for(int cNumber : copiedNumbers) {
            System.out.print(cNumber + " ");
        }

        System.out.println();
    }
}