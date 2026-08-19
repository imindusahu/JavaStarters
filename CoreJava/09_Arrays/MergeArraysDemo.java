/*
 * Topic  : Arrays
 * Program: Merge Two Arrays
 * Author : Indu Sahu
 * Purpose: To merge elements of two array in Java.
 */

public class MergeArraysDemo {
    public static void main(String [] args) {
        mergeTwoArrays();
    }

    private static void mergeTwoArrays() {
        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = {40, 50, 60};

        System.out.println("\n======== MERGE TWO ARRAYS =========\n");

        int[] merged = new int[numbers1.length + numbers2.length];
        int index = 0;

        for(int number : numbers1) {
            merged[index] +=  number;
            index++;
        }

        for(int number : numbers2) {
            merged[index] += number;
            index++;
        }

        System.out.println("Merged Array: ");

        for(int number : merged) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}