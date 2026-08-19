/*
 * Topic  : Arrays
 * Program: Array Maximum
 * Author : Indu Sahu
 * Purpose: Find the maximum element in array in Java.
 */

public class ArrayMaximumDemo {
    public static void main(String [] args) {
        findMaximumElement();
    }

    private static void findMaximumElement() {
        int[] numbers = {10, 45, 23, 78, 34};

        int maximum = numbers[0];
        for(int number : numbers) {
            if(number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum Element : " + maximum);
    }
}