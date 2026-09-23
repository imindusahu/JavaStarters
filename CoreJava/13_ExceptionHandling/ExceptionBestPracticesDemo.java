/*
 * Topic  : Exception Handling
 * Program: ExceptionBestPracticesDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate exception handling best practices.
 */

public class ExceptionBestPracticesDemo {

    static int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException(
                    "Divisor cannot be zero");
        }

        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        try {

            int result = divide(10, 0);

            System.out.println("Result: " + result);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}