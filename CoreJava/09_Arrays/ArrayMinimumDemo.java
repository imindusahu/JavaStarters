/*
 * Topic  : Arrays
 * Program: Array Minimum
 * Author : Indu Sahu
 * Purpose: Find the minimum element in array in Java.
 */

public class ArrayMinimumDemo {
    public static void main(String [] args) {
        findMinimumElement();
    }

    private static void findMinimumElement() {
        int[] numbers = {10, 34, 23, 78, 45};

        int minimum = numbers[0];
        for(int number : numbers) {
            if(number < minimum) {
                minimum = number;
            }
        }
        System.out.println("Minimum Element : " + minimum);
    }
}