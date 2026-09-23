/*
 * Topic  : Exception Handling
 * Program: ExceptionInterview1
 * Author : Indu Sahu
 * Purpose: Demonstrate exception flow through try-catch-finally.
 */

public class ExceptionInterview1 {

    public static void main(String[] args) {

        try {

            System.out.println("Inside try");

            int result = 10 / 0;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Inside catch");

        } finally {

            System.out.println("Inside finally");
        }

        System.out.println("Program ended");
    }
}