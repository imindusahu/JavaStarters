/*
 * Topic  : Arrays
 * Program: Compare Two Array
 * Author : Indu Sahu
 * Purpose: To compare two array element-by-element in Java.
 */


public class CompareArrayDemo {
    public static void main(String [] args) {
        compareTwoArray();
    }

    private static void compareTwoArray() {

        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = {10, 20, 30, 40, 50};

        System.out.println("\n======== COMPARE ARRAYS =========\n");

        System.out.println("\nArrays 1: ");
        for(int number : numbers1) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nArrays 2: ");
        for(int number : numbers2) {
            System.out.print(number +  " ");
        }

        if(numbers1.length != numbers2.length) {
            System.out.println("\n\nArrays are not equal.");
        }

        boolean areEqual = true;
        for(int index = 0; index < numbers1.length; index++) {
            if(numbers1[index] != numbers2[index]) {
                areEqual = false;
                break;
            }
        }
        if(areEqual) {
            System.out.println("\n\nArrays are equal.");
        } else {
            System.out.println("\n\nArrays are not equal.");
        }
    }
}