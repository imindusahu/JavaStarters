/*
 * Topic  : Arrays
 * Program: Missing Number
 * Author : Indu Sahu
 * Purpose: To find the missing number in an array in Java.
 */

public class MissingNumberDemo {
    public static void  main(String [] args) {
        findMissingNumber();
    }

    private static void findMissingNumber() {
        int[] numbers = {1, 3, 4, 5};

        System.out.println("\n======== FIND MISSING NUMBER ==========\n");

        int n = numbers.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int number : numbers) {
            actualSum += number;
        }

        int missingNumber = expectedSum  -  actualSum;

        System.out.println("Missing Number : " + missingNumber);
    }
}
