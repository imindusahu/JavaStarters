/*
 * Topic  : Arrays
 * Program: Remove Duplicate Elemnts
 * Author : Indu Sahu
 * Purpose: To remove duplicate elements in an array in Java.
 */

public class RemoveDuplicateElementsDemo {
    public static void  main(String [] args) {
        removeDuplicateElements();
    }

    private static void removeDuplicateElements() {
        int[] numbers = {10, 20, 10, 30, 20, 40};

        System.out.println("\n=========== REMOVE DUPLICATES ===========\n");

        int[] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;

        for(int i = 0; i < numbers.length; i++) {

            boolean isDuplicate = false;

            for(int j = 0; j < uniqueCount; j++) {
                if(numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }
        System.out.println("\nArray after removing duplicates: ");

        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }

        System.out.println();
    }
}