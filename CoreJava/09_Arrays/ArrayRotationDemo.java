/*
 * Topic  : Arrays
 * Program: Array Rotation
 * Author : Indu Sahu
 * Purpose: Rotate an array one-by-one k times in Java.
 * Time Complexity: O(n × k)
 */

public class ArrayRotationDemo {
    public static void main(String [] args) {
        leftRotationByOne();
        rightRotationByOne();
        leftRotationByKPosition();
        rightRotationByKPosition();
    }

    private static void leftRotationByOne() {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n========= LEFT ROTATION BY ONE POSITION ==========\n");

        int first = numbers[0];

        System.out.println("Before Rotation: ");

        for(int number : numbers) {
            System.out.print(number + " ");
        }
        
        for(int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = first;

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void rightRotationByOne() {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n\n========= RIGHT ROTATION BY ONE POSITION ==========\n");

        int last = numbers[numbers.length - 1];

        System.out.println("Before Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = last;

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void leftRotationByKPosition() {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println("\n\n========= LEFT ROTATION BY K POSITIONS =========\n");

        System.out.println("Before Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int rotation = 1; rotation <= k; rotation++) {
            int first = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = first;
        }

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void rightRotationByKPosition() {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println("\n\n========= RIGHT ROTATION BY K POSITIONS =========\n");

        System.out.println("Before Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int rotation = 1; rotation <= k; rotation++) {
            int last = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            } 
            numbers[0] = last;
        }

        System.out.println("\n\nAfter Rotation: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}