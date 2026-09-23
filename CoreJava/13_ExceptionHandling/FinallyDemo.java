/*
 * Topic  : Exception Handling
 * Program: FinallyDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate the finally block.
 */

public class FinallyDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {

            int result = 10 / 0;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } finally {

            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");
    }
}