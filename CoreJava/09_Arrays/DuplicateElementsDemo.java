/*
 * Topic  : Arrays
 * Program: Find Duplicate Elemnts
 * Author : Indu Sahu
 * Purpose: To find duplicate elements in an array in Java.
 */

public class DuplicateElementsDemo {
    public static void main(String [] args) {
        findDuplicateElements();
    }

    private static void findDuplicateElements() {
        int[] numbers = {10, 20, 10, 30, 10, 20};

        System.out.println("\n========== DUPLICATE ELEMENTS ==========\n");

        for(int i = 0; i < numbers.length; i++) {

            boolean alreadyChecked = false;

            // Check whether this number appeared before
            for(int k = 0; k < i; k++) {
                if(numbers[i] == numbers[k]) {
                    alreadyChecked = true;
                    break;
                } 
            }

            // Skip if we already processed this number
            if(alreadyChecked) {
                continue;
            }

            // Check whether this number appears again
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}