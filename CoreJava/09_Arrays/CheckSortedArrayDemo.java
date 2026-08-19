/*
 * Topic  : Arrays
 * Program: Check Sorted Array
 * Author : Indu Sahu
 * Purpose: To check sorted array element-by-element in Java.
 */

public class CheckSortedArrayDemo {
    public static void main(String [] args) {
        checkSortedArrayAscendingOrder();
        checkSortedArrayDescendingOrder();
    }

    private static void checkSortedArrayAscendingOrder() {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n========= CHECK SORTED ARRAY IN ASCENDING ORDER ==========\n");

        boolean isSorted = true;
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    private static void checkSortedArrayDescendingOrder() {
        int[] numbers = {50, 40, 30, 20, 10};

        System.out.println("\n========= CHECK SORTED ARRAY IN DESCENDING ORDER ==========\n");

        boolean isSorted = true; 
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] < numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}