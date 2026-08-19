/*
 * Topic  : Arrays
 * Program: Second Smallest Element
 * Author : Indu Sahu
 * Purpose: Find the second smallest element of an array in Java.
 */

public class SecondSmallestDemo {
    public static void main(String [] args) {
        findSecondSmallestElement();
    }

    private static void findSecondSmallestElement() {
        int[] numbers = {40, 10, 30, 20, 50};

        System.out.println("\n============ SECOND SMALLEST ============\n");

        int smallest = numbers[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if(numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }
        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : " + secondSmallest);
    }
}