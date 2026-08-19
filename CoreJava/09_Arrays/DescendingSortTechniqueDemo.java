/*
 * Topic  : Arrays
 * Program: Descending Sorting Techniques
 * Author : Indu Sahu
 * Purpose: Sorting the elements in descending order using Bubble sort, Selection sort, Insertion sort in Java.
 */

public class DescendingSortTechniqueDemo {
    public static void main(String [] args) {
        sortElementsUsingBubbleSort();
        sortElementsUsingSelectionSort();
        sortElementsUsingInsertionSort();
    }

    // Bubble Sort: repeatedly swaps adjacent elements. Time: O(n²) and Space: O(1)
    private static void sortElementsUsingBubbleSort() {
        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("\n=========== BUBBLE SORT IN DESCENDING ORDER ===========\n");

        System.out.println("Before Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1 - i; j++) {
                if(numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }  
            }
        }

        System.out.println("\n\nAfter Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Selection Sort: finds the smallest element and puts it in the correct position.
    private static void sortElementsUsingSelectionSort() {
        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("\n========== SELECTION SORT IN DESCENDING ORDER ===========\n");

        System.out.println("Before Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] > numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("\n\nAfter Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    // Insertion Sort: Take an element and insert it into the sorted portion
    private static void sortElementsUsingInsertionSort() {
        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("\n========== INSERTION SORT IN DESCENDING ORDER ===========\n");

        System.out.println("Before Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while(j >= 0 && numbers[j] < key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("\n\nAfter Sorting: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}