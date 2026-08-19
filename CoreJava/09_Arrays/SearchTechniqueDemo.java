/*
 * Topic  : Arrays
 * Program: Array Traversal
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and traversal of arrays in Java.
 */


public class SearchTechniqueDemo {
    public static void main(String [] args) {
        int[] numbers = {10, 20, 20, 20, 30, 40, 50};
        int target = 20;

        searchTargetElementByLinearSearch();
        searchTargetElementByBinarySearch();


        System.out.println("\n\n========= BINARY SEARCH RECURSIVE ==========\n");

        System.out.println("Target : " + target);

        int index = searchTargetElementByBinaryRecursive(numbers, 0, numbers.length - 1, target);

        if (index != -1) {
            System.out.println("Element found at index : " + index);
        } else {
            System.out.println("Element not found.");
        }  

        System.out.println("\n\n=========== FIRST AND LAST OCCURRENCE ===========\n");
       
        System.out.println("Target : " + target);  

        int first = firstOccurrenceByBinarySearch(numbers, target);
        int last = lastOccurrenceByBinarySearch(numbers, target);

        System.out.println("\nFirst Occurrence : " + first);
        System.out.println("Last Occurrence : " + last);
        findFrequencyUsingBinarySearch(numbers, target);


    }

    private static void searchTargetElementByLinearSearch() {

        System.out.println("\n=========== LINEAR SEARCH ===========\n");

        int[] numbers = {10, 20, 30,40, 50, 60};
        int target = 60; 
        boolean found = false;

        System.out.println("Target : " + target);

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] == target) {
                System.out.println("Element found at index : " + index);
                found = true;
                break;
            }
        } 
        if(!found){
            System.out.println("Element not found.");
        }
    }

    // Iterative Binary Search
    private static void searchTargetElementByBinarySearch() {

        System.out.println("\n\n=========== BINARY SEARCH ===========\n");

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        boolean found = false;

        System.out.println("Target : " + target);

        int left = 0;
        int right = numbers.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target) {
                System.out.println("Element found at index : " + mid);
                found = true;
                break;
            } else if(numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(!found) {
            System.out.println("Element not found.");
        }
    }

    //  Recursive Binary Search
    private static int searchTargetElementByBinaryRecursive(int[] numbers, int left, int right, int target) {

        if(left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if(numbers[mid] == target) {
            return mid;
        } 
        
        if(numbers[mid] < target) {
            return searchTargetElementByBinaryRecursive(numbers, mid + 1, right, target);
        } 
        return searchTargetElementByBinaryRecursive(numbers, left, mid - 1, target);

    }

    private static int firstOccurrenceByBinarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int first = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target) {
                first = mid;
                right = mid - 1;
            }else if(numbers[mid] == target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private static int lastOccurrenceByBinarySearch(int[] numbers, int target) {
        
        int left = 0; 
        int right = numbers.length - 1;
        int last = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if(numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    } 

    private static void findFrequencyUsingBinarySearch(int[] numbers, int target) {

        int first = firstOccurrenceByBinarySearch(numbers, target);;
        int last = lastOccurrenceByBinarySearch(numbers, target);
        int frequency = 0;

        frequency = last - first + 1;

        System.out.println("Frequency : " + frequency);
    }
}