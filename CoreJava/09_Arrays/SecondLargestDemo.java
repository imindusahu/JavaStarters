/*
 * Topic  : Arrays
 * Program: Second Largest Element
 * Author : Indu Sahu
 * Purpose: Find the second largest element of an array in Java.
 */

public class SecondLargestDemo {
    public static void main(String [] args) {
        findSecondLargestElement();
    }

    private static void findSecondLargestElement() {
        int[] numbers = {10, 45, 23, 78, 34};

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("\n========== SECOND LARGEST ============\n");

        for(int number : numbers) {
            if(number > largest) {
                secondLargest = largest;
                largest = number;
            } else if(number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);
    }
}