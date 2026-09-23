/*
 * Topic  : Exception Handling
 * Program: MultipleCatchDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate multiple catch blocks.
 */

public class MultipleCatchDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        int[] numbers = {10, 20, 30};

        try {

            int result = 10 / 2;

            System.out.println(result);

            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is out of bounds");
        }

        System.out.println("Program ended");
    }
}