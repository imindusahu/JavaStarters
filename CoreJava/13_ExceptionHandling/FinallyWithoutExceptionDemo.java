/*
 * Topic  : Exception Handling
 * Program: FinallyWithoutExceptionDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate finally when no exception occurs.
 */

public class FinallyWithoutExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {

            int result = 10 / 2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception occurred");

        } finally {

            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");
    }
}